package com.chunyue.spring6.aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class UserControllerImpl implements UserController {
    @Override
    public String addUser() {
        System.out.println("Adding user to the database");
        return "200 OK";
    }

    @Override
    public String getUser() {
        System.out.println("Getting user from the database");
        return "200 OK";
    }

    @Override
    public Exception getUserWithException() {
        System.out.println("Getting user from the database");
        return new Exception("Resource not found");
    }
}
