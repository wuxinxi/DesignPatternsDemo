package com.wxx.design.design_07_iterator

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_07_iterator .
 * TODO:一句话描述
 */
interface Interceptor {
    fun intercept(chain: Chain): String

    interface Chain {
        fun request(): String
        fun proceed(request: String): String
    }
}