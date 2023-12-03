package com.chunyue.spring6.iocxml.dependencyinjection.test;

import com.chunyue.spring6.iocxml.dependencyinjection.Author;
import com.chunyue.spring6.iocxml.dependencyinjection.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void nativeMethodOfConstruction() {
        Author author = new Author();
        author.setName("Chunyue");
        author.setAge(26);

        // Through setters
        Book book1 = new Book();
        book1.setTitle("book1");
        book1.setAuthor(author);
        System.out.println(book1);

        // Through constructors
        Book book2 = new Book("book2", author);
        System.out.println(book2);
    }

    @Test
    public void dependencyInjectionThroughSetter() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Book javaBook = applicationContext.getBean("java-textbook", Book.class);
        Book javaBook2 = applicationContext.getBean("java-textbook2", Book.class);
        Book javaBook3 = applicationContext.getBean("java-textbook3", Book.class);
        System.out.println(javaBook);
        System.out.println(javaBook2);
        System.out.println(javaBook3);
    }

    @Test
    public void dependencyInjectionThroughConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Book cppBook = applicationContext.getBean("cpp-textbook", Book.class);
        System.out.println(cppBook);
    }

    @Test
    public void passingNonStandardValues() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-di.xml");
        Book b1 = applicationContext.getBean("no-author", Book.class);
        System.out.println(b1);
        Book b2 = applicationContext.getBean("werid-name-book", Book.class);
        System.out.println(b2);
    }
}
