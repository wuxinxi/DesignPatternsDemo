package com.wxx.design.design_23_adapter

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_23_adapter .
 * TODO:U盘适配器
 */
class UAdapter(private val u:U) : IAdapter {

    override fun convert():String {
      return  u.data
    }

}