package com.chunyue.spring6.annotation;

import com.chunyue.spring6.annotation.config.MySpringConfiguration;
import com.chunyue.spring6.annotation.resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfiguration {
    @Test
    public void testUseConfiguration() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MySpringConfiguration.class);
        UserController userController = applicationContext.getBean(UserController.class);
        userController.addUser();
    }
}
