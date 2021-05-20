package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:抽象工厂
 */
interface IFactory {
    fun phoneProduct(): IPhoneProduct

    fun routerProduct(): IRouterProduct
}