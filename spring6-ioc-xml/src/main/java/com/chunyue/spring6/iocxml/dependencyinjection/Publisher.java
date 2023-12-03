package com.chunyue.spring6.iocxml.dependencyinjection;

public class Publisher {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "publisher";
    }
}
