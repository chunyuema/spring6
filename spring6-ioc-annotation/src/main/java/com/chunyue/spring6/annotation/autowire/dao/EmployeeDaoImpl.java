package com.chunyue.spring6.annotation.autowire.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {


    @Override
    public void addEmployee() {
        System.out.println("EmployeeDaoImpl: Adding employee...");
    }
}
