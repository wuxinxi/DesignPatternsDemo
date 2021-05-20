package com.wxx.design.design_18_proxy.demo

import com.wxx.design.design_18_proxy.DynamicProxy
import java.lang.reflect.Proxy

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_18_proxy.demo .
 * TODO:一句话描述
 */
fun main() {
    //真实角色
    val daoServiceImpl = DaoServiceImpl()
    val dynamicProxy = DynamicProxy<DaoServiceImpl>(daoServiceImpl)
    val classLoader=daoServiceImpl.javaClass.classLoader
    val proxy = Proxy.newProxyInstance(classLoader, daoServiceImpl.javaClass.interfaces, dynamicProxy) as DaoService
    proxy.add()
    proxy.delete()
}