package com.epam.codinggym.customscope.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrinityScopeConfig {
    @Bean
    public BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new ScopeBeanFactoryPostProcessor();
    }
}
