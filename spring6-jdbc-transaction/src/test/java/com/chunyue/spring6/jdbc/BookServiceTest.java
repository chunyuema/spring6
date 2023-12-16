package com.chunyue.spring6.jdbc;

import com.chunyue.spring6.tx.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testReadOnly() {
        bookService.readOnlyDemo(1);
    }

    @Test
    public void testTimeout() {
        try {
            bookService.timeOutDemo(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
