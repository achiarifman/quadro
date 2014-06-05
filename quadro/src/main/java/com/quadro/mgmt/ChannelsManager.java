package com.quadro.mgmt;

import com.quadro.dao.query.ChannelsQuery;
import com.quadro.entity.Channel;
import com.quadro.utils.QuadroSpringUtils;
import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Achia.Rifman on 04/06/2014.
 */
@Service
public class ChannelsManager {

    @Autowired
    ChannelsQuery channelsQuery;

    @Autowired
    QuadroSpringUtils quadroSpringUtils;

    public String createAndValidateNewChannel(Channel channel){

        Key<Channel> channelKey = channelsQuery.storeNewChannelQuery(channel);
        return channelKey.getId().toString();
    }

    public Channel getLiveChannelById(String id){

        return channelsQuery.getChannelById(id);
    }

    public List<Channel> getAllChannels(){

        return channelsQuery.getAllChannels();
    }
}
