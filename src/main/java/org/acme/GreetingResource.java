package org.acme;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("persons")
    public List<Person> persons() {
        return Person.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("persons/{id}")
    public Person person(@PathParam("id") Long id) {
        return Person.findById(id);
    }
}