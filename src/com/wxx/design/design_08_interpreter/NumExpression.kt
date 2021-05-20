package com.wxx.design.design_08_interpreter

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_08_interpreter .
 * TODO:数字解释器
 */
class NumExpression(val num: Int) : ArithmeticExpression() {
    override fun interpret(): Int {
        return num
    }
}