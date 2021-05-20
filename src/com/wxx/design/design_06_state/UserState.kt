package com.wxx.design.design_06_state

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_06_state .
 * TODO:一句话描述
 */
interface UserState {
    fun share(content: String)

    fun comment(content: String)
}