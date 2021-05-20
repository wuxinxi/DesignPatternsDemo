package com.wxx.design.design_18_proxy.demo2

import com.wxx.design.design_18_proxy.DynamicProxy
import java.lang.reflect.Proxy

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_18_proxy.demo2 .
 * TODO:一句话描述
 */
fun main() {
    val master = Master()
    val classLoader = master.javaClass.classLoader
    val dynamicProxy = DynamicProxy<Master>(master)
    val proxy = Proxy.newProxyInstance(classLoader, master.javaClass.interfaces, dynamicProxy) as IHouse
    proxy.renting()
//    val middleman=Middleman(master)
//    middleman.renting()
}