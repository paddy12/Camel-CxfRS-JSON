package com.eai.rs.helloworld;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Request;

import org.apache.camel.Body;
import org.apache.camel.Exchange;

/**
 * @author AMEER
 *
 */

public class HelloWorldResponseTransformer {
	
	public void ReponseMapper(@Body HelloWorldRequest request, Exchange exchange){
		HelloWorldResponse response = new HelloWorldResponse();
               System.out.println("Request Body ::: "+request.toString());
		response.setMessage("Hello "+request.getName());
		exchange.getIn().setBody(response.getMessage());
		System.out.println("Inside ReponseMapper ::: "+exchange);
	}

 public HelloWorldResponse  getAssets(String id) {
	 
	 HelloWorldResponse response = new HelloWorldResponse();
	response.setId(id);
	response.setMessage("GetAsset Value::::::"+id);
	return response;
	
}
}
