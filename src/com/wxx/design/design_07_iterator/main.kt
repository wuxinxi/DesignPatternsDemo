package com.wxx.design.design_07_iterator

import kotlin.random.Random

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_07_iterator .
 * TODO:一句话描述
 */
fun main() {
    val interceptors = ArrayList<Interceptor>()
    interceptors.add(WechatInterceptor())
    interceptors.add(AliInterceptor())
    interceptors.add(CloudInterceptor())
    interceptors.add(ErrorInterceptor())

    String.format("012")
    val qrCodes = mutableListOf<String>()
    //模拟生成11个二维码串
    for (i in 0..10) {
        val random = Random.nextInt(10, 15)
        qrCodes.add(String.format("%0${random}d", 12345 * i))
    }

    qrCodes.forEach {
        val realInterceptorChain = RealInterceptorChain(it, interceptors, 0)
        val proceed = realInterceptorChain.proceed(it)
        println("<top>.main len=${it.length} [ $it ]  $proceed")
    }
}