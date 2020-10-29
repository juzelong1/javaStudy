package demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandle implements InvocationHandler {

    private Object target;

    //代理谁
    public void setTarget(Object target) {
        this.target = target;
    }

    //获得代理
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //生成代理
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(target, args);
    }

    //加入aop方法
    public void log(String msg) {
        System.out.println("执行了"+ msg + "方法");
    }
}
