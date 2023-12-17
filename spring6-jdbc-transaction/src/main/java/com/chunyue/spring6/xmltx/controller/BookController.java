package com.chunyue.spring6.xmltx.controller;

import com.chunyue.spring6.xmltx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    public void purchaseBook(Integer bookId, Integer userId) {
        System.out.println("Beginning checking out book");
        bookService.purchaseBook(bookId, userId);
        System.out.println("Finished checking out book");
    }
}
