package com.wxx.design.design_22_bridge.coffee

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_22_bridge.coffee .
 * TODO:一句话描述
 */
class BigCoffee(additive: ICoffeeAdditive):Coffee(additive) {
    override fun makeCoffee() {
        println("大杯 ${additive.addSomething()?:"原味"}咖啡")
    }
}