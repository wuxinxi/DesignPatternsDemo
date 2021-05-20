package com.wxx.design.design_22_bridge

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_22_bridge .
 * TODO:一句话描述
 */
open abstract class Computer constructor(private val brand: IBrand) {
    open fun info() {
        print(brand.name())
    }
}

class Desktop(val brand: IBrand) : Computer(brand) {
    override fun info() {
        super.info()
        println("台式机")
    }
}

class Laptop(val brand: IBrand) : Computer(brand) {
    override fun info() {
        super.info()
        println("笔记本")
    }
}


