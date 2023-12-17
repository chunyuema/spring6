package com.chunyue.spring6.resources;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

public class MyClassPathResourceLoader {

    public void loadClassPathResource(String classPath) {
        ClassPathResource classPathResource = new ClassPathResource(classPath);
        System.out.println(classPathResource.getFilename());
        System.out.println(classPathResource.getDescription());
        try {
            InputStream inputStream = classPathResource.getInputStream();
            byte[] b = new byte[1024];
            while(inputStream.read(b) != -1) {
                System.out.println(new String(b));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
