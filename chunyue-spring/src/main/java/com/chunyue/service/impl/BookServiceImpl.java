package com.chunyue.service.impl;

import com.chunyue.annotation.MyAutowire;
import com.chunyue.annotation.MyComponent;
import com.chunyue.dao.BookDao;
import com.chunyue.service.BookService;

@MyComponent
public class BookServiceImpl implements BookService {

    @MyAutowire
    private BookDao bookDao;

    @Override
    public void add() {
        System.out.println("BookServiceImpl: Calling BookServiceDao to add books");
        bookDao.add();
    }
}
