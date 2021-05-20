package com.wxx.design.design_06_state

/**
 * @author ：DELL on 2021/5/15 .
 * @packages ：com.wxx.design.design_06_state .
 * TODO:一句话描述
 */
object UserModel : UserState {
    private var state: UserState

    init {
        state = LoginOutState()
    }

    fun setState(state: UserState) {
        this.state = state
    }

    override fun share(content: String) {
        state.share(content)
    }

    override fun comment(content: String) {
        state.comment(content)
    }

}