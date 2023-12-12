package com.chunyue.spring6.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class XmlLogAspect {

    public void beforeMethod() {
        System.out.println("Before any operation, doing necessary authentication!");
    }

    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("Finished CRUD operation of user: " + joinPoint.getSignature().getName());
    }

    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Executed " + joinPoint.getSignature().getName() + " with status code: " + result);
    }

    public void afterThrowing(JoinPoint joinPoint, Throwable exception) {
        System.out.println("Exception encountered in " + joinPoint.getSignature().getName() + " with " + exception.getMessage());
    }

    public Object around(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argsString = Arrays.toString(args);
        Object res = null;
        try {
            System.out.println("@Around: before method execution");
            res = joinPoint.proceed();
            System.out.println("@Around: after method execution");
        } catch (Throwable throwable) {
            System.out.println("@Around: method exits with exception: " + throwable.getMessage());
        } finally {
            System.out.println("@Around: after method returned");
        }
        return res;
    }

}
