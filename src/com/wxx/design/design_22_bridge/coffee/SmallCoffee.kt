package com.wxx.design.design_22_bridge.coffee

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_22_bridge.coffee .
 * TODO:一句话描述
 */
class SmallCoffee(additive: ICoffeeAdditive) : Coffee(additive) {
    override fun makeCoffee() {

        println("小杯 ${additive.addSomething() ?: "原味"}咖啡")
    }
}