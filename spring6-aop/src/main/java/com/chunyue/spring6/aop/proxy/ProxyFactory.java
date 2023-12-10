package com.chunyue.spring6.aop.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // Return the proxy object dynamically
    public Object getProxy() {
        /**
         * 1. ClassLoader
         * 2. Class[] interfaces
         * 3. InvocationHandler
         */
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy,
                                 Method method,
                                 Object[] args) throws Throwable {
                System.out.println("[LOG] Invoking " + method.getName() + " with arguments: " + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("[LOG] Finished " + method.getName() + " with arguments: " + Arrays.toString(args));
                System.out.println("[LOG] Result: " + result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
