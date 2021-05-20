package com.wxx.design.design_08_interpreter

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_08_interpreter .
 * TODO:加法运算解释器
 */
class AdditionExpression(exp1: ArithmeticExpression, exp2: ArithmeticExpression) : OperatorExpression(exp1, exp2) {
    override fun interpret(): Int {
        return exp1.interpret() + exp2.interpret()
    }
}