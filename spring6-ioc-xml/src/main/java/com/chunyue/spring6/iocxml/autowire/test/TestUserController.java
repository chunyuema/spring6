package com.chunyue.spring6.iocxml.autowire.test;

import com.chunyue.spring6.iocxml.autowire.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {

    @Test
    public void testAutowire() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        userController.addUser();
    }
}
