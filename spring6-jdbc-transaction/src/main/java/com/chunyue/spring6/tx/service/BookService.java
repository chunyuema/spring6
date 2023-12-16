package com.chunyue.spring6.tx.service;

public interface BookService {
    void purchaseBook(Integer bookId, Integer userId);

    void readOnlyDemo(Integer bookId);

    void timeOutDemo(Integer bookId);
}
