package eu.nimble.services.catalog.identity.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.shiro.authz.AuthorizationException;

@Provider
public class AuthorizationExceptionMapper implements ExceptionMapper<AuthorizationException> {

	@Override
	public Response toResponse(AuthorizationException throwable) {
			return Response
					.status(Status.FORBIDDEN)
					.header("WWW-Authenticate", "Basic realm=\"This site\"")
					.entity("No Permission to access this resource!")
					.build();
	}

}
