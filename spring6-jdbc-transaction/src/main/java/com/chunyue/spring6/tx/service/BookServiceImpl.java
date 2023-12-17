package com.chunyue.spring6.tx.service;

import com.chunyue.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    // @Transactional(propagation = Propagation.REQUIRED)
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void purchaseBook(Integer bookId, Integer userId) {
        // get book price and stock based on bookId
        Integer bookPrice = bookDao.getBookPrice(bookId);
        // update book stock
        bookDao.decrementStock(bookId);

        // update user balance
        bookDao.updateUserBalannce(userId, bookPrice);
    }

    @Transactional(readOnly = true)
    @Override
    public void readOnlyDemo(Integer bookId) {
        try {
            bookDao.decrementStock(bookId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Transactional(timeout = 3)
    @Override
    public void timeOutDemo(Integer bookId) {
        try {
            TimeUnit.SECONDS.sleep(5);
            bookDao.decrementStock(bookId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
