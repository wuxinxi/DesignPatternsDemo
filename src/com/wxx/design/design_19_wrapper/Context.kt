package com.wxx.design.design_19_wrapper

/**
 * @author ：DELL on 2021/5/14 .
 * @packages ：com.wxx.design.design_19_wrapper .
 * TODO:抽象
 */
interface Context {
    fun startActivity()
    fun bindService()
    fun unBinderService()
    fun registerBroadcast()
    fun unregisterBroadcast()
}