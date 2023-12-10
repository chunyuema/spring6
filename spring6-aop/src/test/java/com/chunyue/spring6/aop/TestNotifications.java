package com.chunyue.spring6.aop;

import com.chunyue.spring6.aop.annotation.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNotifications {
    @Test
    public void testBeforeNotification() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.getUser();
        userController.addUser();
    }
}
