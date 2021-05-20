package com.wxx.design.design_06_state

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_06_state .
 * TODO:一句话描述
 */
fun main() {
    UserModel.setState(LoginSate())
    UserModel.comment("这篇博客写的不错")

    UserModel.setState(LoginOutState())
    UserModel.share("分享这篇博客")
}