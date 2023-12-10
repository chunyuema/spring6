package com.chunyue.spring6.aop.proxy;

public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        int res = i + j;
        return res;
    }

    @Override
    public int subtract(int i, int j) {
        int res = i - j;
        return res;
    }
}
