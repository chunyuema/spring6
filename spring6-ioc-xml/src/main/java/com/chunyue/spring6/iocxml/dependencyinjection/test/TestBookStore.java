package com.chunyue.spring6.iocxml.dependencyinjection.test;

import com.chunyue.spring6.iocxml.dependencyinjection.BookStore;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookStore {

    @Test
    public void testDummyArrayInjection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-diarray.xml");
        BookStore bookStore = applicationContext.getBean("bookstore", BookStore.class);
        System.out.println(bookStore);
    }
}
