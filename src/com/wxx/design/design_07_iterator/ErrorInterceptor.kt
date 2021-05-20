package com.wxx.design.design_07_iterator

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_07_iterator .
 * TODO:一句话描述
 */
class ErrorInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): String {
        return "ERROR"
    }
}