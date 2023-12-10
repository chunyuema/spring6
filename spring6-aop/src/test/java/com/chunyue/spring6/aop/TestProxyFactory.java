package com.chunyue.spring6.aop;

import com.chunyue.spring6.aop.proxy.Calculator;
import com.chunyue.spring6.aop.proxy.CalculatorImpl;
import com.chunyue.spring6.aop.proxy.ProxyFactory;
import org.junit.jupiter.api.Test;

public class TestProxyFactory {

    @Test
    public void testCalculatorProxy() {
        ProxyFactory calculatorProxyFactory =  new ProxyFactory(new CalculatorImpl());
        Calculator calculator = (Calculator) calculatorProxyFactory.getProxy();
        calculator.add(1, 2);
        calculator.subtract(3, 4);
    }
}
