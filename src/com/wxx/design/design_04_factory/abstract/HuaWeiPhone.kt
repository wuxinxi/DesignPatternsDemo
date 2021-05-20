package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:华为手机
 */
class HuaWeiPhone : IPhoneProduct {
    override fun start() {
        println("HuaWeiPhone.start")
    }

    override fun shutdown() {
        println("HuaWeiPhone.shutdown")
    }

    override fun call() {
        println("HuaWeiPhone.call")
    }

    override fun sendSMS() {
        println("HuaWeiPhone.sendSMS")
    }
}