package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:小米手机
 */
class MiPhone : IPhoneProduct {
    override fun start() {
        println("MiPhone.start")
    }

    override fun shutdown() {
        println("MiPhone.shutdown")
    }

    override fun call() {
        println("MiPhone.call")
    }

    override fun sendSMS() {
        println("MiPhone.sendSMS")
    }
}