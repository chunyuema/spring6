package com.chunyue.spring6.resources;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

public class MyFileSystemResourceLoader {

    public void loadFileResource(String filePath) {
        FileSystemResource fileSystemResource = new FileSystemResource(filePath);
        System.out.println(fileSystemResource.getFilename());
        System.out.println(fileSystemResource.getDescription());
        try {
            InputStream inputStream = fileSystemResource.getInputStream();
            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes) != -1) {
                System.out.println(new String(bytes));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
