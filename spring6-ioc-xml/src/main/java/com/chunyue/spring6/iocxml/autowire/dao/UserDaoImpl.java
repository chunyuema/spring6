package com.chunyue.spring6.iocxml.autowire.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("UserDao: adding user to the database...");
    }
}
