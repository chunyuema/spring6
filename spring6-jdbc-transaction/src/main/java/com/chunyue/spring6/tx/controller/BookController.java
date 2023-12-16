package com.chunyue.spring6.tx.controller;

import com.chunyue.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    public void purchaseBook(Integer bookId, Integer userId) {
        bookService.purchaseBook(bookId, userId);
    }
}
