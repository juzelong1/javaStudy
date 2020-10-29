package com.ju.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class log implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+ "的" + method.getName() + "被执行了");
    }
}
