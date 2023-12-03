package com.chunyue.spring6.iocxml.dependencyinjection;

import java.util.Arrays;

public class BookStore {
    private String[] dummies;

    public String[] getDummies() {
        return dummies;
    }

    public void setDummies(String[] dummies) {
        this.dummies = dummies;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "dummies=" + Arrays.toString(dummies) +
                '}';
    }
}
