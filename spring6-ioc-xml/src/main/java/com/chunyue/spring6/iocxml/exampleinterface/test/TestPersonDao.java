package com.chunyue.spring6.iocxml.exampleinterface.test;

import com.chunyue.spring6.iocxml.exampleinterface.PersonDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPersonDao {

    @Test
    public void testGetInstanceFailWithClass() {
        assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
            PersonDao personDaoImpl1 = applicationContext.getBean(PersonDao.class);
            personDaoImpl1.run();
        });
    }
}
