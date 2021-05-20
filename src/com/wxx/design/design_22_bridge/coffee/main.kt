package com.wxx.design.design_22_bridge.coffee

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_22_bridge.coffee .
 * TODO:一句话描述
 */
fun main() {
    val bigCoffee=BigCoffee(Sweet())
    bigCoffee.makeCoffee()

    val smallCoffee=SmallCoffee(Milk())
    smallCoffee.makeCoffee()
}