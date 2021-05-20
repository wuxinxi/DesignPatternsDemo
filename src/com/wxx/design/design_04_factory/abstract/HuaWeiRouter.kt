package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:华为路由器
 */
class HuaWeiRouter : IRouterProduct {
    override fun start() {
        println("HuaWeiRouter.start")
    }

    override fun shutdown() {
        println("HuaWeiRouter.shutdown")
    }

    override fun openWife() {
        println("HuaWeiRouter.openWife")
    }
}