package com.wxx.design.design_22_bridge.coffee

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_22_bridge.coffee .
 * TODO:一句话描述
 */
class Sweet : ICoffeeAdditive {
    override fun addSomething(): String? {
        return "加糖"
    }
}

class Milk : ICoffeeAdditive {
    override fun addSomething(): String? {
        return "加奶"
    }
}