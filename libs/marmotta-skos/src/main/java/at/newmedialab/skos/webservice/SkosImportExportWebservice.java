/**
 * Copyright (C) 2013 Salzburg Research.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package at.newmedialab.skos.webservice;

import com.google.common.collect.Iterables;
import org.apache.marmotta.commons.sesame.model.Namespaces;
import org.apache.marmotta.commons.sesame.repository.ResourceUtils;
import org.apache.marmotta.platform.core.api.config.ConfigurationService;
import org.apache.marmotta.platform.core.api.importer.ImportService;
import org.apache.marmotta.platform.core.api.io.MarmottaIOService;
import org.apache.marmotta.platform.core.api.task.Task;
import org.apache.marmotta.platform.core.api.task.TaskManagerService;
import org.apache.marmotta.platform.core.api.triplestore.ContextService;
import org.apache.marmotta.platform.core.api.triplestore.SesameService;
import org.apache.marmotta.platform.core.api.user.UserService;
import org.openrdf.model.Resource;
import org.openrdf.model.URI;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.rio.RDFFormat;
import org.openrdf.rio.RDFHandlerException;
import org.openrdf.rio.RDFWriter;
import org.openrdf.rio.Rio;
import org.openrdf.sail.memory.MemoryStore;
import org.slf4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.StreamingOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * User: Thomas Kurz
 * Date: 13.04.12
 * Time: 20:23
 * 
 * TODO: Why not use {@link org.apache.marmotta.platform.core.webservices.io.ImportWebService} and {@link org.apache.marmotta.platform.core.webservices.io.ExportWebService} resp.?
 */
@ApplicationScoped
@Path("/skos")
public class SkosImportExportWebservice {

    @Inject
    private Logger log;

    @Inject
    private ImportService importService;

    @Inject
    private UserService userService;

    @Inject
    private TaskManagerService taskManagerService;

    @Inject
    private MarmottaIOService kiWiIOService;

    @Inject
    private SesameService sesameService;

    @Inject
    private ContextService contextService;

    @Inject
    private ConfigurationService configurationService;

    private static final ThreadGroup IMPORTER_THREADS = new ThreadGroup("asynchronous skos imports");
    private static final String TASK_GROUP_NAME = "SkosImports";


    /**
     * For CORS operations TODO: make it more fine grained (maybe user dependent)
     * + TODO filter chain do not work properly
     * @param reqHeaders
     * @return
     */
    @OPTIONS
    @Path("/import")
    public Response optionsResourceRemote(@HeaderParam("Access-Control-Request-Headers") String reqHeaders) {
        if(reqHeaders == null) {
            reqHeaders = "Accept, Content-Type";
        }
        return Response.ok()
                .header("Allow", "POST")
                .header("Access-Control-Allow-Methods","POST")
                .header("Access-Control-Allow-Headers", reqHeaders)
                .header("Access-Control-Allow-Origin",configurationService.getStringConfiguration("sparql.allow_origin","*"))
                .build();

    }


    @POST
    @Path("import")
    @Produces("application/json")
    public Response skosImport(@Context HttpServletRequest request, @QueryParam("context") String context_string) {
        String type = request.getHeader("Content-Type");
        if (type == null || !importService.getAcceptTypes().contains(type)) return Response.status(412).entity("type '" + type + "' is not valid").build();

        Task t = taskManagerService.createTask(String.format("Import (%s; %s)", request.getRemoteHost(), type), TASK_GROUP_NAME);
        try {
            InputStream in = request.getInputStream();
            //create context
            final URI context = contextService.getContext(context_string);
            if (context == null) throw new Exception("context is not an existing resource");

            importService.importData(in,type,userService.getCurrentUser(),context);

            return Response.ok().entity("import of content successful").build();
        } catch(Exception ex) {
            log.error("error while importing",ex);
            return Response.status(500).entity("error while importing: "+ex.getMessage()).build();
        } finally {
            t.endTask();
        }

    }

    @GET
    @Path("export/{name}")
    public Response skosExport(@PathParam("name") String fileName, @QueryParam("type") String type, @QueryParam("context") String context_string) {

        final RDFFormat serializer = kiWiIOService.getSerializer(type);
        if(serializer==null) {
            Response.status(Response.Status.BAD_REQUEST).entity("Type is not supported");
        }
        if(context_string==null) return Response.status(Response.Status.BAD_REQUEST).entity("Context may not be null!").build();
        URI context = contextService.getContext(context_string);
        if (context==null) return Response.status(Response.Status.BAD_REQUEST).entity("Context does not exist!").build();



        try {
            final Repository tempRepository = new SailRepository(new MemoryStore());
            tempRepository.initialize();
            RepositoryConnection lmfConnection = sesameService.getConnection();
            RepositoryConnection tmpConnection = tempRepository.getConnection();

            URI concept = lmfConnection.getValueFactory().createURI(Namespaces.NS_SKOS + "Concept");
            URI scheme  = lmfConnection.getValueFactory().createURI(Namespaces.NS_SKOS+"ConceptScheme");

            Iterable<Resource> resources = Iterables.concat(
                    ResourceUtils.listResources(lmfConnection, concept, context),
                    ResourceUtils.listResources(lmfConnection,scheme,context));


            for(Resource resource : resources) {
                tmpConnection.add(lmfConnection.getStatements(resource, null, null, true, context));
            }

            tmpConnection.close();
            lmfConnection.close();

            StreamingOutput entity = new StreamingOutput() {
                @Override
                public void write(OutputStream output) throws IOException, WebApplicationException {
                    RDFWriter writer = Rio.createWriter(serializer, output);
                    try {
                        RepositoryConnection connection = tempRepository.getConnection();
                        connection.exportStatements(null,null,null,true,writer);
                        connection.close();
                    } catch (RepositoryException e) {
                        throw new WebApplicationException(e, Status.INTERNAL_SERVER_ERROR);
                    } catch (RDFHandlerException e) {
                        throw new IOException("error while writing RDF data to stream");
                    }

                }
            };


            return Response.ok()
                    .entity(entity)
                    .header("Content-Type", type)
                    .header("Content-Disposition", "attachment; filename=\"" + fileName + "\"")
                    .build();
        } catch (RepositoryException e) {
            return Response.serverError().build();
        }
    }

    @POST
    @Path("currentUser")
    public Response setCurrentUserAsProperty(@QueryParam("context") String context, @QueryParam("property") String property,
            @QueryParam("replace") @DefaultValue("true") boolean replace_existing, @FormParam("uri[]") String[] resources1,
            @FormParam("uri") String[] resources2) {
        final URI currentUser = userService.getCurrentUser();

        // We do not set anonymous
        if (userService.isAnonymous(currentUser)) return Response.ok().build();

        ArrayList<String> rscs = new ArrayList<String>();
        for (String string : resources1) {
            rscs.add(string);
        }
        for (String string : resources2) {
            rscs.add(string);
        }

        final URI ctx = contextService.getContext(context);
        if (ctx == null) return Response.status(Status.NOT_FOUND).entity("Context/Graph " + context + " not found!").build();

        try {
            RepositoryConnection conn = sesameService.getConnection();
            try {
                for (String uri : rscs) {
                    final URI rsc = ResourceUtils.getUriResource(conn,uri);
                    if (rsc == null) {
                        continue;
                    }

                    if (replace_existing) {
                        ResourceUtils.removeProperty(conn,rsc, property, ctx);
                    }
                    ResourceUtils.addOutgoingNode(conn,rsc, property, currentUser, ctx);
                }
            } finally {
                conn.commit();
                conn.close();
            }
        } catch (RepositoryException e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Error accessing triple store: " + e.getMessage()).build();
        }

        return Response.ok().build();
    }

}
