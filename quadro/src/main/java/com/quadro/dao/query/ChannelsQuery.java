package com.quadro.dao.query;

import com.quadro.entity.Channel;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Achia.Rifman on 04/06/2014.
 */
@Component
public class ChannelsQuery {

    @Autowired
    Datastore datastore;


    public org.mongodb.morphia.Key<Channel> storeNewChannelQuery(Channel channel){

        return datastore.save(channel);
    }

    public Channel getChannelById(String id){

        ObjectId objectId = new ObjectId(id);
        return datastore.get(Channel.class,objectId);
    }

    public List<Channel> getAllChannels(){

        return datastore.find(Channel.class).asList();
    }

    /*public Key<Channel> modifyChannel(Channel channel){

        datastore.
    }*/

}
