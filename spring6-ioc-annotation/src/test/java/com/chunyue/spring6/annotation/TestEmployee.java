package com.chunyue.spring6.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

    @Test
    public void useComponentAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println(employee);
    }
}
