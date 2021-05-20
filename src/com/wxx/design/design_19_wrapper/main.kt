package com.wxx.design.design_19_wrapper

/**
 * @author ：DELL on 2021/5/14 .
 * @packages ：com.wxx.design.design_19_wrapper .
 * TODO:一句话描述
 */
fun main() {
    val context = ContextImpl()
    val wrapper = ContextWrapper(context)
    wrapper.sendBroadcast()
    wrapper.startService()
    wrapper.stopService()
    wrapper.bindService()
    wrapper.unBinderService()
}