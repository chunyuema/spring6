package com.chunyue.spring6.iocxml.autowire.controller;

import com.chunyue.spring6.iocxml.autowire.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("UserController: Calling user service to add user");
        userService.addUserService();
    }
}
