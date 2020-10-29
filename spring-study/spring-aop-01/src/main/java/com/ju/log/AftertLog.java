package com.ju.log;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AftertLog implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+ "的" + method.getName() + "被执行了");
    }
}
