package com.wxx.design.design_05_strategy

/**
 * @author ：DELL on 2021/5/14 .
 * @packages ：com.wxx.design.design_05_strategy .
 * TODO:一句话描述
 */
interface QRStrategy {
    fun verify(qr: String): Boolean
    fun pay()
}