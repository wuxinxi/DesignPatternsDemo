package com.wxx.design.design_23_adapter

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_23_adapter .
 * TODO:一句话描述
 */
fun main() {
    val computer = Computer()
    val u = U()
    val uAdapter = UAdapter(u)

    println(computer.readDataFromU(uAdapter))
}