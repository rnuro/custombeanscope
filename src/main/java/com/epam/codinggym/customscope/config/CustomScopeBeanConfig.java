package com.epam.codinggym.customscope.config;

import com.epam.codinggym.customscope.bean.CustomScopeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CustomScopeBeanConfig {
    @Bean
    @Scope(scopeName = "trinity")
    public CustomScopeBean getBean() {
        return new CustomScopeBean();
    }
}
