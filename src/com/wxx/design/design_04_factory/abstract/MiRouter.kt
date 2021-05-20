package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:小米路由器
 */
class MiRouter : IRouterProduct {
    override fun start() {
        println("MiRouter.start")
    }

    override fun shutdown() {
        println("MiRouter.shutdown")
    }

    override fun openWife() {
        println("MiRouter.openWife")
    }
}