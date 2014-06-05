package com.quadro.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Created by Achia.Rifman on 03/06/2014.
 */
@Path("/client")
public class ClientRestService {

    Logger LOGGER = LoggerFactory.getLogger(ClientRestService.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response isAlive(){

        LOGGER.debug("Quadro is alive api was called..");
        return Response.status(200).entity("Quadro is alive!").build();
    }
}
