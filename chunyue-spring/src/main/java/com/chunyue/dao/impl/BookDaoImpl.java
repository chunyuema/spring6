package com.chunyue.dao.impl;

import com.chunyue.annotation.MyComponent;
import com.chunyue.dao.BookDao;

@MyComponent
public class BookDaoImpl implements BookDao {
    @Override
    public void add() {
        System.out.println("BookDaoImpl: Adding book...");
    }
}
