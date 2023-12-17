package com.chunyue.spring6.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Transactional
    @Override
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            System.out.println("Begin checking out: " + bookId);
            bookService.purchaseBook(bookId, userId);
            System.out.println("Finished checking out: " + bookId);
        }
    }
}
