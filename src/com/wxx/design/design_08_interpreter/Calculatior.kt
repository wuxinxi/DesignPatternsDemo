package com.wxx.design.design_08_interpreter

import java.util.*

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_08_interpreter .
 * TODO:expression表达式：21 + 2 + 341 - 100  符号直接一定要加上空格
 */
class Calculatior(val expression: String) {
    private val expStack = Stack<ArithmeticExpression>()

    init {
        //临时存储运算符左右两边的数字
        var exp1: ArithmeticExpression
        var exp2: ArithmeticExpression

        //根据空格分割表达式字符串
        val elements = expression.split(" ").toTypedArray()
        var isContinue=false
        for (i in elements.indices) {
           if(isContinue){
               isContinue=false
               continue
           }
            when (elements[i][0]) {
                '+' -> {
                    exp1 = expStack.pop()
                    //找到符号后面的数字，下次循环需要continue
                    exp2 = NumExpression(elements[i + 1].toInt())
                    expStack.push(AdditionExpression(exp1, exp2))
                    isContinue=true
                }
                '-' -> {
                    exp1 = expStack.pop()
                    //找到符号后面的数字，下次循环需要continue
                    exp2 = NumExpression(elements[i + 1].toInt())
                    expStack.push(SubtractionExpression(exp1, exp2))
                    isContinue=true
                }
                else -> {
                    //数字
                    expStack.push(NumExpression(elements[i].toInt()))
                    isContinue=false
                }
            }
        }
    }

    fun calculate(): Int {
        return expStack.pop().interpret()
    }
}