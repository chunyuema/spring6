package com.chunyue.spring6.iocxml.dependencyinjection;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void nativeMethodOfConstruction() {
        // Through setters
        Book book1 = new Book();
        book1.setTitle("book1");
        book1.setAuthor("author1");
        System.out.println(book1);

        // Through constructors
        Book book2 = new Book("book2", "author2");
        System.out.println(book2);
    }

    @Test
    public void dependencyInjectionThroughSetter() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Book javaBook = applicationContext.getBean("java-textbook", Book.class);
        System.out.println(javaBook);
    }
}
