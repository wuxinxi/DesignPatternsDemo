package com.wxx.design.design_18_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 作者：wuxinxi on 2019/11/1
 * 包名：com.wxx.design.design_18_proxy
 * TODO:动态代理需实现InvocationHandler
 */
class DynamicProxy<T> implements InvocationHandler {

    private T classz;

    public DynamicProxy(T classz) {
        this.classz = classz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(classz, args);
    }
}
