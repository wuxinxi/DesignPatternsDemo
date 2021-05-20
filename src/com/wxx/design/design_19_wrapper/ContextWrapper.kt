package com.wxx.design.design_19_wrapper

/**
 * @author ：DELL on 2021/5/14 .
 * @packages ：com.wxx.design.design_19_wrapper .
 * TODO:对ContextImpl的包装
 */
class ContextWrapper(private val context: Context) : Context {
    override fun startActivity() {
        context.startActivity()
    }

    override fun bindService() {
        context.bindService()
    }

    override fun unBinderService() {
        context.unBinderService()
    }

    override fun registerBroadcast() {
        context.registerBroadcast()
    }

    override fun unregisterBroadcast() {
        context.unBinderService()
    }

    fun startService() {
        println("ContextWrapper.startService")
    }

    fun stopService() {
        println("ContextWrapper.stopService")
    }

    fun sendBroadcast() {
        println("ContextWrapper.sendBroadcast")
    }

    fun getApplicationContext(): Context {
        println("ContextWrapper.getApplicationContext")
        return this
    }
}