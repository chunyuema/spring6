package com.chunyue.spring6.annotation.resource.controller;

import com.chunyue.spring6.annotation.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // Inject through name
//    @Resource(name = "myUserService")
//    private UserService userService;

    // Inject through type
    @Resource
    private UserService userService;

    public void addUser() {
        System.out.println("UserController: calling user service to add user...");
        userService.addEmployee();
    }
}
