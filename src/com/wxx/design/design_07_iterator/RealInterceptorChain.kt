package com.wxx.design.design_07_iterator

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_07_iterator .
 * TODO:一句话描述
 */
class RealInterceptorChain(private val qrCode: String, private val interceptors: List<Interceptor>,
                           private var index: Int) : Interceptor.Chain {

    private fun copy(index: Int = this.index, qrCode: String = this.qrCode) = RealInterceptorChain(qrCode, interceptors, index)

    override fun request(): String {
        return qrCode
    }

    override fun proceed(request: String): String {
        val interceptor = interceptors[index]
        val next = copy(index = index + 1, qrCode = request)
        val response = interceptor.intercept(next)
        return response
    }
}