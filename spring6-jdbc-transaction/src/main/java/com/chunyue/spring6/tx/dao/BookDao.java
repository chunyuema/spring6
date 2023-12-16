package com.chunyue.spring6.tx.dao;

public interface BookDao {
    Integer getBookPrice(Integer bookId);

    void decrementStock(Integer bookId);

    void updateUserBalannce(Integer userId, Integer bookPrice);
}
