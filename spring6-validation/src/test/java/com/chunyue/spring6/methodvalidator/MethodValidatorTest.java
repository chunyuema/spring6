package com.chunyue.spring6.methodvalidator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MethodValidatorTest {

    @Test
    public void testValidatePerson() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MethodValidator validator = context.getBean(MethodValidator.class);
        validator.validatePerson(new Person("Chunyue", 23, "1234567890"));
    }
}
