package com.chunyue.spring6.annotation.autowire.controller;

import com.chunyue.spring6.annotation.autowire.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    // CASE 1: inject by property - use type to look for object and perform injection
//    @Autowired
//    private EmployeeService employeeService;

    // CASE 2: inject by setter
//    private EmployeeService employeeService;
//
//    @Autowired
//    public void setEmployeeService(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    // CASE 3: inject by constructor
//    private EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    // CASE 4: inject by constructor argument
    private EmployeeService employeeService;

    public EmployeeController(@Autowired EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void addEmployee() {
        System.out.println("EmployeeController: calling employee service to add employee...");
        employeeService.addEmployee();
    }
}
