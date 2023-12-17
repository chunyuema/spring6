package com.chunnyue.spring6.resources;

import com.chunyue.spring6.resources.MyClassPathResourceLoader;
import org.junit.jupiter.api.Test;

public class MyClassPathResourceLoaderTest {

    @Test
    public void testClassPathResourceLoader() {
        MyClassPathResourceLoader myClassPathResourceLoader = new MyClassPathResourceLoader();
        myClassPathResourceLoader.loadClassPathResource("chunyue.txt");
    }
}
