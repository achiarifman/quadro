package com.quadro.bootstrap;

import com.quadro.utils.QuadroSpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Achia.Rifman on 04/06/2014.
 */
@Configuration
public class QuadroBeansBootStrap {


    @Autowired
    private ApplicationContext applicationContext;
}
