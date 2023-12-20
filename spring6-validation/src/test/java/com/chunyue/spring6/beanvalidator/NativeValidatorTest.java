package com.chunyue.spring6.beanvalidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NativeValidatorTest {

    @Test
    public void testNativeValidator() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        NativeValidator nativeValidator = applicationContext.getBean(NativeValidator.class);
        Person person =  new Person();

        Assertions.assertFalse(nativeValidator.validatePerson(person));

        person.setName("Chunyue");
        person.setAge(17);
        Assertions.assertTrue(nativeValidator.validatePerson(person));
    }
}
