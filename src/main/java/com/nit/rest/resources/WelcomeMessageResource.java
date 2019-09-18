package com.nit.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")
public class WelcomeMessageResource {
	

	 public WelcomeMessageResource() {
		
		System.out.println("WelcomeMessageResource 0 param Constructor");
	}
	
	@Path("/welmsg")
	@GET
	public String welcomeMessage() {
		
		return "Welcome to Restful services implementation by JERSEY and ServletContainer as FrontController ";
	}
	
	@Path("/greetmsg")
	@GET
	public String greetMsg() {
		
		return "good morning";
		
	}
	
}
