package com.chunyue.spring6.methodvalidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
@ComponentScan("com.chunyue.spring6.methodvalidator")
public class ValidationConfig {

    @Autowired
    public MethodValidationPostProcessor getValidator() {
        return new MethodValidationPostProcessor();
    }
}
