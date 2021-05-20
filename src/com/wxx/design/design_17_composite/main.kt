package com.wxx.design.design_17_composite

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_17_composite .
 * TODO:一句话描述
 */
fun main() {
    val c = Folder("C")
    val 个人文件 = Folder("个人文件")
    个人文件.addDir(File("img.jpg"))
    个人文件.addDir(File("小说.txt"))
    c.addDir(个人文件)
    c.addDir(Folder("百度网盘"))

    c.print()
}