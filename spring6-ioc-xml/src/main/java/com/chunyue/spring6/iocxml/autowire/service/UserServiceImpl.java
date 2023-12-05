package com.chunyue.spring6.iocxml.autowire.service;

import com.chunyue.spring6.iocxml.autowire.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("UserService: Calling userDao to add user...");
        userDao.addUserDao();
    }
}
