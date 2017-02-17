/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.nimble.services.catalog.identity.webservices;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;

import eu.nimble.services.catalog.identity.api.IdentityLogin;
import eu.nimble.services.catalog.identity.api.IdentityService;
import eu.nimble.services.catalog.identity.model.IdentityProfile;
import eu.nimble.services.catalog.identity.model.impl.Identity;
import eu.nimble.services.catalog.identity.model.impl.LoginResult;

@Path("/identity")
@RequestScoped
public class IdentityWebService {

    @Inject
    private Logger log;

    @Inject 
    private IdentityService identityService;
    
    @Inject
    private IdentityLogin loginHandler;
    
//
    /**
     * Helper method to determine the first non-null parameter of a given kind
     * @param ts
     * @return
     */
    private <T> T firstNonNull(T ...ts ) {
    	for (T t : ts ) {
    		if (t != null) {
    			return t;
    		}
    	}
    	return null;
    }
    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(@FormParam("username") String username, @FormParam("password") String password, @QueryParam("user") String user, @QueryParam("pwd") String pwd) {
    	try {
    		String u = firstNonNull(username, user);
    		String p = firstNonNull(password, pwd);
    		LoginResult result = loginHandler.login(u, p, false);
    		return Response.ok(result).build();
    	} catch (AuthorizationException e) {
	    	return Response.status(Response.Status.UNAUTHORIZED).entity(e.getLocalizedMessage()).build();
    	} catch (AuthenticationException e) {
	    	return Response.status(Response.Status.FORBIDDEN).entity("Authentication required - please login!").build();
    	} catch (Exception e) {
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getLocalizedMessage()).build();
    	}
    }
    
    @POST
    @Path("/logout")
    @Produces(MediaType.APPLICATION_JSON)
    public Response logout() {
    	try {
    		loginHandler.logout();
    		return Response.ok().build();
    	} catch (AuthorizationException e) {
	    	return Response.status(Response.Status.UNAUTHORIZED).entity("No permissions!").build();
    	} catch (AuthenticationException e) {
	    	return Response.status(Response.Status.FORBIDDEN).entity("Authentication required - please login!").build();
    	} catch (Exception e) {
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Internal Server Error").build();
    	}
    }
    /** 
     * Helper method to check whether a POST works when a GET does not work
     * sounds weird....
     */
    @POST
    @Path("/user/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response userInfo(@PathParam("username") String username,  @Context HttpServletRequest request) {
    	try {
    		IdentityProfile profile = identityService.getProfile(username);
    		return Response.ok(profile).build();
    	} catch (AuthorizationException e) {
	    	return Response.status(Response.Status.UNAUTHORIZED).entity(e.getLocalizedMessage()).build();
    	} catch (AuthenticationException e) {
	    	return Response.status(Response.Status.FORBIDDEN).entity("Authentication required - please login!").build();
//    	} catch (SessionException e) {
//	    	return Response.status(Response.Status.FORBIDDEN).entity(e.getLocalizedMessage()).build();
    	} catch (Exception e) {
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Login Attempt from "+username+" not successful").build();
    	}
    }
    
    @GET
    @Path("/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUserInfo(@PathParam("username") String username,  @Context HttpServletRequest request) {
    	try {
    		IdentityProfile profile = identityService.getProfile(username);
    		return Response.ok(profile).build();
    	} catch (AuthorizationException e) {
	    	return Response.status(Response.Status.UNAUTHORIZED).entity(e.getLocalizedMessage()).build();
    	} catch (AuthenticationException e) {
	    	return Response.status(Response.Status.FORBIDDEN).entity("Authentication required - please login!").build();
//    	} catch (SessionException e) {
//	    	return Response.status(Response.Status.FORBIDDEN).entity(e.getLocalizedMessage()).build();
    	} catch (Exception e) {
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Login Attempt from "+username+" not successful").build();
    	}
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/user")
    public Response userByEMail(@FormParam("email") String email, @QueryParam("email") String qEMail) {
  
    	try {
    		String mail = firstNonNull(email, qEMail);
    		IdentityProfile ownerId = identityService.getProfileByEMail(mail);
    		return Response.ok(ownerId, MediaType.APPLICATION_JSON).build();
    	} catch (AuthorizationException e) {
    		log.error(e.getLocalizedMessage());
	    	return Response.status(Response.Status.UNAUTHORIZED).entity("No permissions!").build();
    	} catch (AuthenticationException e) {
    		log.error(e.getLocalizedMessage());
	    	return Response.status(Response.Status.FORBIDDEN).entity("Authentication required - please login!").build();
    	} catch (Exception e) {
    		log.error(e.getLocalizedMessage());
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getLocalizedMessage()).build();
    	}
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response setProfile(@FormParam("username") String username, @FormParam("password") String password, @FormParam("email") String email, @FormParam("gender") String gender) {
    	try {
    		IdentityProfile profile = identityService.getProfile(username);
    		return Response.ok(profile).build();
    	} catch (AuthorizationException e) {
	    	return Response.status(Response.Status.UNAUTHORIZED).entity("No permissions!").build();
    	} catch (AuthenticationException e) {
	    	return Response.status(Response.Status.FORBIDDEN).entity("Authentication required - please login!").build();
    	} catch (Exception e) {
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Login Attempt from "+username+" not successful").build();
    	}
    }
    @POST
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addProfile(Identity profile) {
    	try {
    		IdentityProfile added = identityService.addProfile(profile);
    		if ( added != null ) {
    			return Response.ok(added).build();
    		}
    		return Response.status(Response.Status.BAD_REQUEST).entity("Profile creation not successful").build();
    	} catch (AuthorizationException e) {
	    	return Response.status(Response.Status.UNAUTHORIZED).entity("No permissions!").build();
    	} catch (AuthenticationException e) {
	    	return Response.status(Response.Status.FORBIDDEN).entity("Authentication required - please login!").build();
    	} catch (Exception e) {
    		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Profile creation not successful").build();
    	}
    }
}
