package com.chunyue.spring6.aop;

import com.chunyue.spring6.aop.annotation.UserController;
import com.chunyue.spring6.aop.xmlaop.AnimalController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNotifications {
    @Test
    public void testNotificationAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.getUser();
        userController.addUser();
    }

    @Test
    public void testNotificationXml() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-xml-aop.xml");
        AnimalController animalController = applicationContext.getBean(AnimalController.class);
        animalController.getAnimal();
        animalController.addAnimal();
    }

    @Test
    public void testNotificationsForThrowingExceptions() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.getUserWithException();
    }
}
