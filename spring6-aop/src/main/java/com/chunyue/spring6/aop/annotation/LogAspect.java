package com.chunyue.spring6.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    // Type of notification: Before, AfterReturning, AfterThrowing, After, Around
    @Before(value = "execution(public void com.chunyue.spring6.aop.annotation.UserControllerImpl.*(..))") // Set where
    // to cut in and when
    public void authentication() {
        System.out.println("Before any operation, doing necessary authentication!");
    }

    @After(value = "execution(* com.chunyue.spring6.aop.annotation.UserControllerImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("Finished CRUD operation of user: " + joinPoint.getSignature().getName());
    }

}
