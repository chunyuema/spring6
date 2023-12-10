package com.chunyue.spring6.aop.proxy;

public class CalculatorStaticProxy implements Calculator {

    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("Adding " + i + " and " + j);

        // Core functionality is done else where
        int addResult = calculator.add(i, j);

        System.out.println("Adding finished, result is: " + addResult);
        return 0;
    }

    @Override
    public int subtract(int i, int j) {
        return 0;
    }
}
