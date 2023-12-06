package com.chunyue.spring6.annotation.autowire.service;

import com.chunyue.spring6.annotation.autowire.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // inject by property: use type to look for object and perform injection
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void addEmployee() {
        System.out.println("EmployeeServiceImpl: calling dao to add employee");
        employeeDao.addEmployee();
    }
}
