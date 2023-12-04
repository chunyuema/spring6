package com.chunyue.spring6.iocxml.beanscope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestOrder {

    @Test
    public void testSingletonBean() {
        // Creating shared instance of singleton bean 'order-singleton'
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope.xml");
        Order order = applicationContext.getBean("order-singleton", Order.class);
        Order order1 = applicationContext.getBean("order-singleton", Order.class);
        System.out.println(order + " " + order1);
        assertEquals(order, order1);
    }

    @Test
    public void testPrototypeBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope.xml");
        Order order = applicationContext.getBean("order-prototype", Order.class);
        Order order1 = applicationContext.getBean("order-prototype", Order.class);
        System.out.println(order + " " + order1);
        assertNotEquals(order, order1);
    }
}
