package com.quadro.rest;

import com.quadro.entity.Channel;
import com.quadro.mgmt.ChannelsManager;

import com.sun.jersey.api.core.InjectParam;
import org.bson.types.ObjectId;

import javax.ws.rs.*;


/**
 * Created by Achia.Rifman on 03/06/2014.
 */
@Path("provider")
@Consumes("application/json")
@Produces("application/json")
public class ProviderRestService {

    @InjectParam("channelsManager")
    private ChannelsManager channelsManager;


    @POST
    @Path("channels/create")

    public String createChannel(Channel channel){

        return channelsManager.createAndValidateNewChannel(channel);
    }

    @GET
    @Path("channels/{id}")
    public Channel getChannel(@PathParam("id") String channelId){

        return channelsManager.getLiveChannelById(channelId);
    }

    @GET
    @Path("channels")
    public List<Channel> getAllChannels(){

        return channelsManager.getAllChannels();
    }

    @PUT
    @Path("channels/{id}")
    public Channel modifyChannel(Channel channel, @PathParam("id") String channelId){

        channel.setId(new ObjectId(channelId));
        channelsManager.createAndValidateNewChannel(channel);
        return channelsManager.getLiveChannelById(channelId);
    }
}
