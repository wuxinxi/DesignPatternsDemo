package com.wxx.design.design_14_visit

import kotlin.random.Random

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_14_visit .
 * TODO:经理
 */
class Manager(name: String) : Staff(name) {
    private val products = Random.nextInt(10, 20)
    override fun accept(visit: Visit) {
        visit.visit(this)
    }

    //产品数量
    fun getProducts(): Int {
        return products
    }

}