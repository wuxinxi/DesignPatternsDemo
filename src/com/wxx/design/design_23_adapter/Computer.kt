package com.wxx.design.design_23_adapter

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_23_adapter .
 * TODO:电脑
 */
class Computer {

    fun readDataFromU(adapter:IAdapter) {

        println("电脑读取U盘数据成功...${ adapter.convert()}")
    }
}