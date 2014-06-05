package com.quadro.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Achia.Rifman on 04/06/2014.
 */
@Component
public class QuadroSpringUtils {


    @Autowired
    private ApplicationContext context;

    public ApplicationContext getApplicationContextAware(){
        return context;
    }

    public <T> T getBean(Class<T> beanType) {
        return context.getBean(beanType);
    }

    public <T> T getBean(Class<T> beanType, String beanName) {
        return context.getBean(beanName, beanType);
    }

    public <T> Map<String, T> getBeans(Class<T> beanType) {
        return context.getBeansOfType(beanType);
    }
}
