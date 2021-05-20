package com.wxx.design.design_14_visit

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_14_visit .
 * TODO:一句话描述
 */
fun main() {
    val report = Report()
    val ceo = CEO()
    val cto = CTO()
    report.show(ceo)
    println("-------------------------------")
    report.show(cto)
}