package com.chunyue.service.impl;

import com.chunyue.annotation.MyComponent;
import com.chunyue.service.BookService;

@MyComponent
public class BookServiceImpl implements BookService {
    @Override
    public void add() {
        System.out.println("BookServiceImpl: Calling BookServiceDao to add books");
    }
}
