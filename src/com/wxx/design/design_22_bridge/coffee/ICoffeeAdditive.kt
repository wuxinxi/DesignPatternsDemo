package com.wxx.design.design_22_bridge.coffee

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_22_bridge.coffee .
 * TODO:咖啡添加剂
 */
interface ICoffeeAdditive {
    //添加的东西：糖、冰淇淋、null原味
    fun addSomething(): String?
}