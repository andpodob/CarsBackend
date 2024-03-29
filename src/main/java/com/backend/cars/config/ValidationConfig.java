package com.backend.cars.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validator;

@Configuration
public class ValidationConfig {

    @Bean
    public Validator validator(){
        return new LocalValidatorFactoryBean();
    }
}
