package com.chunyue.spring6.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeControllerTest {

    @Test
    public void testAddEmployee() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        employeeController.addEmployee();
    }

    @Test
    public void testUpdateEmployee() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        employeeController.updateEmployee();
    }

    @Test
    public void testDeleteEmployee() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
        employeeController.deleteEmployee();
    }
}
