package com.wxx.design.design_03_prototpye

import java.util.*

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_03_prototpye .
 * TODO:一句话描述
 */
class User : Cloneable {

    var userName: String? = null
    var userAddress: String? = null
    var registerDate: Date? = null

    constructor(userName: String?, userAddress: String?, registerDate: Date?) {
        this.userName = userName
        this.userAddress = userAddress
        this.registerDate = registerDate
    }

    constructor()

    public override fun clone(): Any {
        val user = super.clone() as User
        //对象类型进行深copy
        user.registerDate=this.registerDate?.clone() as? Date
        return user
    }

    override fun toString(): String {
        return "User(userName=$userName, userAddress=$userAddress, registerDate=$registerDate)"
    }


}