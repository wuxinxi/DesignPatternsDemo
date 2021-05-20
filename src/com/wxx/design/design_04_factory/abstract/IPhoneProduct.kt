package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:手机抽象
 */
interface IPhoneProduct {
    fun start()
    fun shutdown()
    fun call()
    fun sendSMS()
}