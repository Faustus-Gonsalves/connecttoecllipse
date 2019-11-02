package com.lti;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/a")
public class HelloService 
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello()
	{
		System.out.println("It is working ?");
		return "Welcome to JAX-RS";
	}

}
