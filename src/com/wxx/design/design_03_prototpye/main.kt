package com.wxx.design.design_03_prototpye

import java.time.Instant
import java.util.*

/**
 * @author ：DELL on 2021/5/12 .
 * @packages ：com.wxx.design.design_03_prototpye .
 * TODO:一句话描述
 */
fun main() {
    var date = Date()
    val user = User("唐人", "安徽亳州", date)
    val copy = user.clone() as User
    println("hashCode=${user.hashCode()} user=$user")
    println("hashCode=${copy.hashCode()} copy=$copy")

    //只有registerDate进行深copy才不会修改copy后的数据
    date.time=100000000

    println("hashCode=${user.hashCode()} user=$user")
    println("hashCode=${copy.hashCode()} copy=$copy")
}