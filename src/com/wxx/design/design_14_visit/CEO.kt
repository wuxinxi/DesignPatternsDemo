package com.wxx.design.design_14_visit

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_14_visit .
 * TODO:CEO 只关注程序员的KPI ，经理的KPI以及产品数量
 */
class CEO : Visit {
    override fun visit(enginner: Enginner) {
        println("CE0 检查程序员${enginner.name} 的业绩 KPI=${enginner.kpi} ")
    }

    override fun visit(manager: Manager) {
        println("CE0 检查经理${manager.name}的业绩 KPI=${manager.kpi} 产品数量=${manager.getProducts()}")
    }
}