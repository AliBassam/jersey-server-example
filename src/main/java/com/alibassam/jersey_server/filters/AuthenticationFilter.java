package com.alibassam.jersey_server.filters;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class AuthenticationFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		String authHeader = requestContext.getHeaderString(HttpHeaders.WWW_AUTHENTICATE);
		if(authHeader == null || "".equals(authHeader)) {
			String returnMessage = "You are not allowed to acess these webservices";
			throw new WebApplicationException(Response.status(Status.FORBIDDEN).entity(returnMessage).build());
		}
	}

}
