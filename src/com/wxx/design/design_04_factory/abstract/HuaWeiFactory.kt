package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:华为工厂
 */
class HuaWeiFactory : IFactory {
    override fun phoneProduct(): IPhoneProduct = HuaWeiPhone()

    override fun routerProduct(): IRouterProduct = HuaWeiRouter()
}