package com.chunnyue.spring6.resources;

import com.chunyue.spring6.resources.MyFileSystemResourceLoader;
import org.junit.jupiter.api.Test;

public class MyFilePathResourceLoaderTest {

    @Test
    public void testLoadFile() {
        MyFileSystemResourceLoader myFileSystemResourceLoader = new MyFileSystemResourceLoader();
        myFileSystemResourceLoader.loadFileResource("chunyue.txt");
    }
}
