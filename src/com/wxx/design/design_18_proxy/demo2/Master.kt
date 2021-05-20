package com.wxx.design.design_18_proxy.demo2

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_18_proxy.demo2 .
 * TODO:房东
 */
class Master:IHouse {
    open override fun renting() {
        println("房东出租房子")
    }
}