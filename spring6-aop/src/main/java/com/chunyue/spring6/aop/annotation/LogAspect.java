package com.chunyue.spring6.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {

    @Pointcut(value = "execution(* com.chunyue.spring6.aop.annotation.UserControllerImpl.*(..))")
    public void pointCut() {}

    // Type of notification: Before, AfterReturning, AfterThrowing, After, Around
    @Before(value = "pointCut()") // Set where
    // to cut in and when
    public void authentication() {
        System.out.println("Before any operation, doing necessary authentication!");
    }

    @After(value = "com.chunyue.spring6.aop.annotation.LogAspect.pointCut()")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("Finished CRUD operation of user: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "execution(* com.chunyue.spring6.aop.annotation.UserControllerImpl.*(..))",
                    returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Executed " + joinPoint.getSignature().getName() + " with status code: " + result);
    }

    @AfterThrowing(value = "execution(* com.chunyue.spring6.aop.annotation.UserControllerImpl.*(..))",
                   throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Throwable exception) {
        System.out.println("Exception encountered in " + joinPoint.getSignature().getName() + " with " + exception.getMessage());
    }

    @Around(value = "execution(* com.chunyue.spring6.aop.annotation.UserControllerImpl.*(..))")
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
