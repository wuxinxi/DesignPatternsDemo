package com.wxx.design.design_06_state

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_06_state .
 * TODO:一句话描述
 */
class LoginSate:UserState {
    override fun share(content: String) {
        println("LoginSate.share $content  分享成功")
    }

    override fun comment(content: String) {
        println("LoginSate.comment $content 评论成功")
    }
}