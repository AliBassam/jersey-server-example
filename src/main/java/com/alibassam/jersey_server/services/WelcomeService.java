package com.alibassam.jersey_server.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/welcome")
public class WelcomeService {

	@GET
	@Path("hello")
	public Response helloWorld() {
		String welcomeMessage = "Hello World!";
		return Response.ok(welcomeMessage).build();
	}
}
