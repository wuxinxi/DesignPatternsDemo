package com.wxx.design.design_19_wrapper

/**
 * @author ：DELL on 2021/5/14 .
 * @packages ：com.wxx.design.design_19_wrapper .
 * TODO:抽象的具体实现
 */
class ContextImpl : Context {
    override fun startActivity() {
        println("ContextImpl.startActivity")
    }

    override fun bindService() {
        println("ContextImpl.bindService")
    }

    override fun unBinderService() {
        println("ContextImpl.unBinderService")
    }

    override fun registerBroadcast() {
        println("ContextImpl.registerBroadcast")
    }

    override fun unregisterBroadcast() {
        println("ContextImpl.unregisterBroadcast")
    }
}