package com.chunyue.spring6.annotation;

import com.chunyue.spring6.annotation.autowire.controller.EmployeeController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserController {
    @Test
    public void testAddUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        employeeController.addEmployee();
    }
}
