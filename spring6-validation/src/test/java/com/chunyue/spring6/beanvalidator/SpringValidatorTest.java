package com.chunyue.spring6.beanvalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringValidatorTest {
    @Test
    public void testNativeValidator() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        SpringValidator springValidator = applicationContext.getBean(SpringValidator.class);
        Person person =  new Person();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            springValidator.validatePerson(person);
        });

        person.setName("Chunyue");
        person.setAge(17);
        Assertions.assertDoesNotThrow(() -> springValidator.validatePerson(person));
    }
}
