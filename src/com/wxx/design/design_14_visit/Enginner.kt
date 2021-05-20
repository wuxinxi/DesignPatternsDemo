package com.wxx.design.design_14_visit

import kotlin.random.Random

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_14_visit .
 * TODO:程序员
 */
class Enginner(name: String) : Staff(name) {
    private val lines = Random.nextInt(1000, 20000)
    override fun accept(visit: Visit) {
        visit.visit(this)
    }

    //代码行数
    fun codeLines(): Int {
        return lines
    }
}