package com.chunyue.spring6.iocxml.exampleinterface.test;

import com.chunyue.spring6.iocxml.exampleinterface.PersonDao;
import com.chunyue.spring6.iocxml.exampleinterface.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
//    private static ApplicationContext applicationContext;
//
//    @BeforeClass
//    public static void setUp() {
//        applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//    }

    @Test
    public void testGetInstanceSuccessThroughInterface() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }


}
