package com.wxx.design.design_14_visit

import kotlin.random.Random

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_14_visit .
 * TODO:员工基类
 */
abstract class Staff(val name: String) {
    val kpi: Int

    init {
        kpi = Random.nextInt(10)
    }

    abstract fun accept(visit: Visit)
}