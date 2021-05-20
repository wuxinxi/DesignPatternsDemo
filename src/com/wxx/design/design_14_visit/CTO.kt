package com.wxx.design.design_14_visit

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_14_visit .
 * TODO:CTO 关注程序员的代码行数 ，经理的及产品数量
 */
class CTO : Visit {
    override fun visit(enginner: Enginner) {
        println("CT0 检查程序员${enginner.name} 的业绩 代码行数=${enginner.codeLines()} ")
    }

    override fun visit(manager: Manager) {
        println("CT0 检查经理${manager.name}的业绩  产品数量=${manager.getProducts()}")
    }
}