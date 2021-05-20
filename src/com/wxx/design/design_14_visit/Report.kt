package com.wxx.design.design_14_visit

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_14_visit .
 * TODO:考核报告
 */
class Report {
    private val list = ArrayList<Staff>()

    init {
        list.add(Manager("王经理"))
        list.add(Manager("张经理"))
        list.add(Enginner("程序员A"))
        list.add(Enginner("程序员B"))
        list.add(Enginner("程序员C"))
        list.add(Enginner("程序员D"))
        list.add(Enginner("程序员E"))
    }

    fun show(visit: Visit) {
        list.forEach {
            it.accept(visit)
        }
    }
}