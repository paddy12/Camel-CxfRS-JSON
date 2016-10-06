package com.eai.rs.helloworld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author AMEER
 *
 */

@Path("/")
public class HelloWorldImpl {
	
	@Path("/getHelloWorld")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public HelloWorldResponse getHelloWorld(@QueryParam("") HelloWorldRequest request){
		System.out.println("Indise getHelloWorld ::: "+request);
		return null; 
	}
	
	
	 @GET
	    @Path("/test/{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public HelloWorldResponse getAssets(@PathParam("id") String id ){
	        return null;
	    }
}
