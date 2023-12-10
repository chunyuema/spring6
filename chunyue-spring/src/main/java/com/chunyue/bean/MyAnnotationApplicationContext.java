package com.chunyue.bean;

import com.chunyue.annotation.MyAutowire;
import com.chunyue.annotation.MyComponent;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyAnnotationApplicationContext implements MyApplicationContext{

    // Create Map Collection to store the beans
    private Map<Class, Object> myIocContainer = new HashMap<>();

    private static String rootPath;

    @Override
    public Object getBean(Class clazz) {
        return myIocContainer.get(clazz);
    }

    // Configure how the scanning is done to determine which bean is created
    // Look for the @MyAutowire, @MyComponent
    public MyAnnotationApplicationContext(String basePackage) {
        try {
            // Based on the basePackage, create the absolute path to the package
            String basePackagePath = basePackage.replaceAll("\\.", "\\/" );
            System.out.println("basePackagePath: " + basePackagePath);

            Enumeration<URL> urls = Thread.currentThread()
                    .getContextClassLoader()
                    .getResources(basePackagePath);

            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");

                rootPath = filePath.substring(0, filePath.length() - basePackagePath.length());
                System.out.println("rootPath:  " + rootPath);

                // Scan the package based on the file path
                loadBean(new File(filePath));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        dependencyInjection();
    }

    private void loadBean(File file) throws Exception {
        System.out.println("Loading file: " + file.getAbsolutePath());
        // Check if the file is a directory
        if (file.isDirectory()) {
             // If directory, get all content from the directory
            File[] childFiles = file.listFiles();

            // Base case: if dir is empty, return
            if (childFiles == null || childFiles.length == 0) return;

            // Recursive case: if dir is not empty, iterate through all content
            for (File childFile : childFiles) {
                // For directory, Recurse on the directory with loadBean
                if (childFile.isDirectory()) {
                    System.out.println(childFile.getAbsolutePath() + "  is a directory, recurse");
                    loadBean(childFile);
                }
                // For file (non directory),
                else {
                    System.out.println(childFile.getAbsolutePath() + " is a file, try to load bean");
                    String pathWithClass = childFile.getAbsolutePath().substring(rootPath.length() - 1);
                    System.out.println("pathWithClass: " + pathWithClass);

                    // Check for .class file and then get the clazz
                    if (pathWithClass.contains(".class")) {
                        // Get the clazz from path
                        System.out.println(pathWithClass + " is a class file, try to load bean");
                        String clazzName = pathWithClass.replaceAll("/", ".")
                                                        .replace(".class", "")
                                                        .substring(1);
                        System.out.println("clazzName: " + clazzName);

                        // Check it is not an interface, and is a class with annotation
                        Class<?> clazz = Class.forName(clazzName);
                        if (!clazz.isInterface()) {
                            System.out.println("Hello");
                            MyComponent annotation = clazz.getAnnotation(MyComponent.class);
                            if (annotation != null) {
                                System.out.println("Hello");
                                // Create the object through reflect
                                Object instance = clazz.getConstructor().newInstance();
                                // Add the object into the IocContainer map
                                if (clazz.getInterfaces().length > 0) {
                                    myIocContainer.put(clazz.getInterfaces()[0], instance);
                                } else {
                                    myIocContainer.put(clazz, instance);
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("IOC container: " + myIocContainer);
        }
    }

    private void dependencyInjection() {
        // Iterate through the beans in the IocContainer to get all objects
        Set<Map.Entry<Class, Object>> entries = myIocContainer.entrySet();
        for (Map.Entry<Class, Object> entry : entries) {
            // For every object, get the properties of them
            Object object = entry.getValue();
            Class<?> clazz = object.getClass();
            Field[] fields = clazz.getDeclaredFields();

            // For every property, check if @MyAutowire is annotated and inject dependency
            for (Field field : fields) {
                MyAutowire myAutowire =  field.getAnnotation(MyAutowire.class);
                if (myAutowire != null) {
                    field.setAccessible(true);
                    try {
                        field.set(object, myIocContainer.get(field.getType()));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
