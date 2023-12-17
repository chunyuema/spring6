package com.chunyue.spring6.jdbc;

import com.chunyue.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class BookControllerTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        Integer[] bookIds = {1, 2};
        bookController.checkOutBooks(bookIds, 1);
    }
}
