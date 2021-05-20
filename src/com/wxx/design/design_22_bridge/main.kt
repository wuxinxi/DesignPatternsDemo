package com.wxx.design.design_22_bridge

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_22_bridge .
 * TODO:一句话描述
 */
fun main() {
    //利用组合替代继承
    //联想台式机
    val computer=Desktop(Lenovo())
    computer.info()

    //苹果笔记本
    val computer2=Laptop(Apple())
    computer2.info()
}