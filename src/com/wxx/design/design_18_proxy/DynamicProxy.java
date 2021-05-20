package com.wxx.design.design_18_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 作者：wuxinxi on 2019/11/1
 * 包名：com.wxx.design.design_18_proxy
 * TODO:动态代理需实现InvocationHandler
 */
public class DynamicProxy<T> implements InvocationHandler {

    private T classz;

    public DynamicProxy(T classz) {
        this.classz = classz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object res = method.invoke(classz, args);
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("执行 %s 耗时%d ms", method.getName(), endTime - startTime));
        return res;
    }
}
