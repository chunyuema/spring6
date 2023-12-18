package com.chunnyue.spring6.resources;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class BuiltInResourceLoader {

    @Test
    public void testClassPathResource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        Resource resource = applicationContext.getResource("chunyeu.txt");
        System.out.println(resource.getFilename());
    }

    @Test
    public void testFileSystemResource() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext();
        Resource resource = applicationContext.getResource("chunyue.txt");
        System.out.println(resource.getFilename());
    }
}
