package com.chunyue.spring6.annotation;

import com.chunyue.spring6.annotation.autowire.controller.EmployeeController;
import com.chunyue.spring6.annotation.resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestController {
    @Test
    public void testEmployeeController() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        employeeController.addEmployee();
    }

    @Test
    public void testUserController() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = applicationContext.getBean(UserController.class);
        userController.addUser();
    }
}
