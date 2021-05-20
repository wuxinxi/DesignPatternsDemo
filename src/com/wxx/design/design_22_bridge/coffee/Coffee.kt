package com.wxx.design.design_22_bridge.coffee

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_22_bridge.coffee .
 * TODO:咖啡抽象类：大杯、中杯、小杯
 */
open abstract class Coffee constructor(protected val additive: ICoffeeAdditive) {
    //制作coffee
    abstract fun makeCoffee()

}