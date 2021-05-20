package com.wxx.design.design_05_strategy

/**
 * @author ：DELL on 2021/5/14 .
 * @packages ：com.wxx.design.design_05_strategy .
 * TODO:一句话描述
 */
class AliStrategy : QRStrategy {
    override fun verify(qr: String): Boolean {
        println("AliStrategy.verify $qr")
        return true
    }

    override fun pay() {
        println("AliStrategy.pay")
    }
}