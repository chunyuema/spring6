package com.chunyue.spring6.annotation.autowire.controller;

import com.chunyue.spring6.annotation.autowire.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    // inject by property: use type to look for object and perform injection
    @Autowired
    private EmployeeService employeeService;

    public void addEmployee() {
        System.out.println("EmployeeController: calling employee service to add employee...");
        employeeService.addEmployee();
    }
}
