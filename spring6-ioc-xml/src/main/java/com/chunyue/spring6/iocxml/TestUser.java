package com.chunyue.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        // Get bean through id
        User user = (User) applicationContext.getBean("user");
        System.out.println("Bean obtained through id: " + user);

        // Get bean through class: this requires that the xml file to only have
        // one of the same class. => expecting single match!
        User user1 = applicationContext.getBean(User.class);
        System.out.println("Bean obtained through class: " + user1);

        // Use both ways
        User user2 = applicationContext.getBean("user", User.class);
        System.out.println("Bean obtained through both: " + user2);
    }
}
