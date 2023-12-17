package com.chunyue.spring6.resources;

import org.springframework.core.io.UrlResource;

public class MyUrlResourceLoader {

    public void loadUrlResource(String path) {
        try {
            UrlResource url = new UrlResource(path);
            System.out.println(url.getFilename());
            System.out.println(url.getURL());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
