package com.chunyue.spring6.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer getBookPrice(Integer bookId) {
        String sql = "SELECT price FROM bookstore WHERE id=?";
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
        return price;
    }

    @Override
    public void decrementStock(Integer bookId) {
        String sql = "UPDATE bookstore SET stock=stock-1 WHERE id=?";
        jdbcTemplate.update(sql, bookId);
    }

    @Override
    public void updateUserBalannce(Integer userId, Integer bookPrice) {
        String sql = "UPDATE user SET balance=balance-? WHERE id=?";
        jdbcTemplate.update(sql, bookPrice, userId);
    }
}
