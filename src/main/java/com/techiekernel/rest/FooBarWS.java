package com.techiekernel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techiekernel.service.FooBarService;

@Component
public class FooBarWS {
	//@Autowired
	FooBarService fooBarService;
 
	@GET
	@Path("/{param}")
	public Response getMessage(@PathParam("param") String msg) {
		return Response.status(200).entity(fooBarService.getMessage(msg)).build();
	}

	public FooBarService getFooBarService() {
		return fooBarService;
	}

	public void setFooBarService(FooBarService fooBarService) {
		this.fooBarService = fooBarService;
	}
	
}
