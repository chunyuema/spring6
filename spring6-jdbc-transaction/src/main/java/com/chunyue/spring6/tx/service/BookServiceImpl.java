package com.chunyue.spring6.tx.service;

import com.chunyue.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional
    @Override
    public void purchaseBook(Integer bookId, Integer userId) {
        // get book price and stock based on bookId
        Integer bookPrice = bookDao.getBookPrice(bookId);

        // update book stock
        bookDao.decrementStock(bookId);

        // update user balance
        bookDao.updateUserBalannce(userId, bookPrice);
    }
}
