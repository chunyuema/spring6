package com.chunyue;

import com.chunyue.bean.MyAnnotationApplicationContext;
import com.chunyue.bean.MyApplicationContext;
import com.chunyue.service.BookService;
import org.junit.jupiter.api.Test;

public class TestBookService {

    @Test
    public void testBookServiceMyComponentCreation() {
        Class clazz = MyApplicationContext.class;
        System.out.println(clazz);
        MyApplicationContext myApplicationContext = new MyAnnotationApplicationContext("com.chunyue");
        BookService bookService = (BookService) myApplicationContext.getBean(BookService.class);
        bookService.add();
    }
}
