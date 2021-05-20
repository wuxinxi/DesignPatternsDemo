package com.wxx.design.design_17_composite

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_17_composite .
 * TODO:表示文件、文件夹的抽象类
 */
abstract class Dir(private val name: String) {
    val list = ArrayList<Dir>()

    //添加一个文件或者文件夹
    abstract fun addDir(dir: Dir)

    //删除一个文件或者文件夹
    abstract fun rmDir(dir: Dir)

    //清空文件夹中的所有文件
    abstract fun clearDir()

    //打印文件夹目录结构
    abstract fun print()

    //获取文件夹下面所有文件以及子文件夹
    abstract fun getFiles(): List<Dir>

    //获取文件或文件夹名字
    fun getName(): String {
        return name
    }
}