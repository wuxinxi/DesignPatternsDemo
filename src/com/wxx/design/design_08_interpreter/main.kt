package com.wxx.design.design_08_interpreter

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_08_interpreter .
 * TODO:一句话描述
 */
fun main() {
    val calculatior=Calculatior("100 + 200 + 300 - 600 + 700")
    println(calculatior.calculate())
}