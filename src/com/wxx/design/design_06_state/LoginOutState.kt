package com.wxx.design.design_06_state

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_06_state .
 * TODO:一句话描述
 */
class LoginOutState : UserState {
    override fun share(content: String) {
        println("LoginOutState.share 未登录无法完成分享->跳转登录页面")
    }

    override fun comment(content: String) {
        println("LoginOutState.comment  未登录无法完成评论->跳转登录页面")
    }
}