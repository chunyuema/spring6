package com.chunnyue.spring6.resources;

import com.chunyue.spring6.resources.MyUrlResourceLoader;
import org.junit.jupiter.api.Test;

public class MyUrlResourceLoaderTest {
    @Test
    public void testLoadUrlResource() throws Exception {
        String urlPath = "http://google.com";
        MyUrlResourceLoader myUrlResourceLoader = new MyUrlResourceLoader();
        myUrlResourceLoader.loadUrlResource(urlPath);

        String filePath = "file:chunyue.txt";
        myUrlResourceLoader.loadUrlResource(filePath);
    }
}
