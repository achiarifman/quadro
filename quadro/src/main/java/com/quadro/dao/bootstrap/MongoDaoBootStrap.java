package com.quadro.dao.bootstrap;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.net.UnknownHostException;

/**
 * Created by Achia.Rifman on 04/06/2014.
 */
@Configuration
public class MongoDaoBootStrap {

    @Value("#{props['mongo.host']}")
    String mongoHost;

    @Value("#{props['mongo.port']}")
    String mongoPort;

    @Value("#{props['mongo.morphia.package']}")
    String morphiaPackage;

    @Bean(name = "mongo")
    public Mongo mongo() {

        Mongo mongo;
        try {
            mongo = new MongoClient(new ServerAddress(mongoHost, Integer.parseInt(mongoPort)));
        } catch (UnknownHostException e) {
            throw new BeanCreationException(e.toString(), e);
        }

        return mongo;
    }

    @Bean(name = "morphia")
    @DependsOn("mongo")
    public Morphia morphia() {

        Morphia morphia = new Morphia();
        morphia.mapPackage(morphiaPackage);
        return morphia;

    }
}
