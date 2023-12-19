package com.chunyue.spring6.springI18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objects = new Object[]{new Date().toString()};
        String string = applicationContext.getMessage("greeting", objects, Locale.CHINA);
        System.out.println(string);
    }
}
