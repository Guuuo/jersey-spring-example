package com.niko.example.jersey.resource;

import com.niko.example.jersey.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author nikog
 */
@Component
@Path("/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @Path("/{username}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getUser(@PathParam("username") String username) {
        return userService.load(username);
    }
}