package com.wxx.design.design_18_proxy.demo2

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_18_proxy.demo2 .
 * TODO:动态代理
 */
class DynamicProxy<T> constructor(private val t: T) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method, args: Array<out Any>?): Any {
        return method.invoke(t,  *(args ?: emptyArray()))
    }
}

fun main() {
    val house = Master()
    val classLoader = house.javaClass.classLoader
    val dynamicProxy = DynamicProxy<Master>(house)
    val proxy = Proxy.newProxyInstance(classLoader, house.javaClass.interfaces, dynamicProxy) as IHouse
    proxy.renting()
}