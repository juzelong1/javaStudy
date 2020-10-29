package com.ju.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class diy {

    @Before("execution(* com.ju.service.userServiceImpl.*(..))")
    public void before() {
        System.out.println("方法执行前");
    }

    @After("execution(* com.ju.service.userServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后");
    }

    @Around("execution(* com.ju.service.userServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pj) throws Throwable {

        System.out.println("===环绕开始===");

        System.out.println(pj.getSignature());
        Object proceed = pj.proceed();

        System.out.println("===环绕结束===");

        System.out.println(proceed);

    }
}
