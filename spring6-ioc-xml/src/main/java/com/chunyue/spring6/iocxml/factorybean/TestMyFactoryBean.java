package com.chunyue.spring6.iocxml.factorybean;

import com.chunyue.spring6.iocxml.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyFactoryBean {
    @Test
    public void testGetUserFromFactoryBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        Assertions.assertEquals(applicationContext.getBean("user").getClass(), User.class);
    }
}
