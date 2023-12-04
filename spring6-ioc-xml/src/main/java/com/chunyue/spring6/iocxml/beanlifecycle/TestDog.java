package com.chunyue.spring6.iocxml.beanlifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDog {
    @Test
    public void testBeanLifecycle() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        Dog dog = applicationContext.getBean("dog", Dog.class);
        System.out.println("Finished creating the bean, ready to use!");
        System.out.println(dog);
        // calling this to destroy the bean
        applicationContext.close();
    }
}
