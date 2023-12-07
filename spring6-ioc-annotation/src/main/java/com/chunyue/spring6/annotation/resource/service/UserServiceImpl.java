package com.chunyue.spring6.annotation.resource.service;

import com.chunyue.spring6.annotation.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service(value = "myUserService")
public class UserServiceImpl implements UserService {

    // Do no specify the name here, the name used is "myUserDao"
    @Resource
    private UserDao myUserDao;

    @Override
    public void addEmployee() {
        System.out.println("UserServiceImpl: calling dao to add user");
        myUserDao.addUser();
    }
}
