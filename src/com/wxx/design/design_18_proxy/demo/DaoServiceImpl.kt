package com.wxx.design.design_18_proxy.demo

/**
 * @author ：DELL on 2021/5/13 .
 * @packages ：com.wxx.design.design_18_proxy.demo .
 * TODO:一句话描述
 */
class DaoServiceImpl:DaoService {
    override fun add() {
        Thread.sleep(2000)
        println("DaoServiceImpl.add")
    }

    override fun delete() {
        Thread.sleep(1000)
        println("DaoServiceImpl.delete")
    }

    override fun update() {
        println("DaoServiceImpl.update")
    }

    override fun query() {
       println("DaoServiceImpl.query")
    }
}