package com.wxx.design.design_04_factory.abstract

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_04_factory.abstract .
 * TODO:
 */
fun main() {
    val miFactory = MiFactory()
    val miPhoneProduct = miFactory.phoneProduct()
    val miRouterProduct = miFactory.routerProduct()
    miPhoneProduct.start()
    miPhoneProduct.sendSMS()
    miRouterProduct.start()
    miRouterProduct.openWife()

    val huaWeiFactory=HuaWeiFactory()
    val huaWeiPhoneProduct=huaWeiFactory.phoneProduct()
    val huaWeiRouterProduct=huaWeiFactory.routerProduct()
    huaWeiPhoneProduct.start()
    huaWeiPhoneProduct.call()
    huaWeiRouterProduct.start()
    huaWeiRouterProduct.openWife()
}