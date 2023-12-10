package com.chunyue.spring6.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class UserControllerImpl implements UserController {
    @Override
    public void addUser() {
        System.out.println("Adding user to the database");
    }

    @Override
    public void getUser() {
        System.out.println("Getting user from the database");
    }
}
