package com.wxx.design.design_18_proxy.demo

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_18_proxy.demo .
 * TODO:实现通过动态代理实现检测DaoServiceImpl每个方法执行的耗时时间
 *
 * InvocationHandler：调用处理程序并且返回一个结果
 * Proxy:提供创建动态代理类和实例的静态方法
 */
class MyInvocationHandler<T : Any> constructor(private val instance: T) : InvocationHandler {

    fun getProxy(): Any {
        return Proxy.newProxyInstance(this.javaClass.classLoader, instance.javaClass.interfaces, this)
    }

    override fun invoke(proxy: Any, method: Method, args: Array<out Any>?):Any?{
        val startTime = System.currentTimeMillis()
        val res = method.invoke(instance, args)
        val endTime = System.currentTimeMillis()
        println("执行${method.name} 耗时 ${endTime - startTime} 毫秒")
        return res
    }
}