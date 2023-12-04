package com.chunyue.spring6.iocxml.beanlifecycle;

public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Step 2: Setting the name property of bean: " + name);
        this.name = name;
    }

    public Dog() {
        System.out.println("Step 1: Non-argument constructor is invoked");
    }

    public void initMethod() {
        System.out.println("Step 4: Initialization of the Dog bean");
    }

    public void destroyMethod() {
        System.out.println("Step 5: Destruction of the Dog bean");
    }
}
