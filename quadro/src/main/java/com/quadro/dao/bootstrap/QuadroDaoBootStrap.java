package com.quadro.dao.bootstrap;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.net.UnknownHostException;

/**
 * Created by Achia.Rifman on 04/06/2014.
 */
@Configuration
public class QuadroDaoBootStrap {

    @Autowired
    Morphia morphia;

    @Autowired
    Mongo mongo;

    @Value("#{props['mongo.db']}")
    String dbName;

    @Bean
    @DependsOn("morphia")
    public Datastore datastore(){

        Datastore datastore = morphia.createDatastore(mongo, dbName);
        datastore.ensureIndexes();
        return datastore;
    }

}
