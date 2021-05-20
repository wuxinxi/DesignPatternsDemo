package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:小米抽象工厂
 */
class MiFactory : IFactory {
    override fun phoneProduct(): IPhoneProduct = MiPhone()

    override fun routerProduct(): IRouterProduct = MiRouter()
}