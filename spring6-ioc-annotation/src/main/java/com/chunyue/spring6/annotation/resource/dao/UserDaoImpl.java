package com.chunyue.spring6.annotation.resource.dao;

import org.springframework.stereotype.Repository;

// Mark the name as myUserDao so that user service can find it
@Repository("myUserDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("UserDaoImpl: Adding user...");
    }
}
