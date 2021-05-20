package com.wxx.design.design_05_strategy

/**
 * @author ：DELL on 2021/5/14 .
 * @packages ：com.wxx.design.design_05_strategy .
 * TODO:一句话描述
 */
class WechatStrategy : QRStrategy {
    override fun verify(qr: String): Boolean {
        println("WechatStrategy.verify $qr")
        return true
    }

    override fun pay() {
        println("WechatStrategy.pay")
    }
}