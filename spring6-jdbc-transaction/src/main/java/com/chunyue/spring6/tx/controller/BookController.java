package com.chunyue.spring6.tx.controller;

import com.chunyue.spring6.tx.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private CheckoutService checkoutService;

    public void checkOutBooks(Integer[] bookIds, Integer userId) {
        System.out.println("Beginning checking out books");
        checkoutService.checkout(bookIds, userId);
        System.out.println("Finished checking out books ");
    }
}
