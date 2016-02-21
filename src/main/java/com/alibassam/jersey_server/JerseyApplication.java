package com.alibassam.jersey_server;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.alibassam.jersey_server.filters.AuthenticationFilter;
import com.alibassam.jersey_server.utils.ExceptionHandler;

@ApplicationPath("services")
public class JerseyApplication extends ResourceConfig {
	public JerseyApplication() {
		packages("com.alibassam.jersey_server.services");
		
		register(AuthenticationFilter.class);
		register(ExceptionHandler.class);
	}
}