package com.example.BLOGGO.controller;

import com.example.BLOGGO.beans.blogInfo;
import com.example.BLOGGO.services.blogService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("blog")
public class blog_controller {

    blogService blogService=new blogService();
    @POST
    @Path("/content")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registerBlog(blogInfo info)
    {
        if(blogService.registerBlog(info))
        {
            return Response.ok().build();
        }
        else
        {
            return Response.status(203).build();
        }
    }

    @POST
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getBlog(blogInfo info)
    {

        blogInfo getInfo;
        if((getInfo=blogService.getBlog(info))!=null)
        {
            return Response.ok(getInfo).build();
        }
        else
        {
            return Response.status(203).build();

        }

    }
}
