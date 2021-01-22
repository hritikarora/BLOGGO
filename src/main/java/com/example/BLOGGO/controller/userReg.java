package com.example.BLOGGO.controller;

import com.example.BLOGGO.beans.users;
import com.example.BLOGGO.services.userService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("user")
public class userReg {
    userService userService = new userService();
    @POST
    @Path("/register")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registerStudent(users user) throws URISyntaxException {

        if(userService.registerUser(user)){
            return Response.ok().build();
        }else{
            return Response.status(203).build();
        }
    }

    @POST
    @Path("/login")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response loginStudent(users user) throws URISyntaxException
    {
        if(userService.verifyEmail(user)){
            return Response.ok().build();
        }else{
            return Response.status(203).build();
        }
    }
}