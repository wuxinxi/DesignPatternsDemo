package com.wxx.design.design_17_composite

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_17_composite .
 * TODO:一句话描述
 */
class File(name: String) : Dir(name) {
    override fun addDir(dir: Dir) {
        throw IllegalAccessException("文件不支持addDir操作")
    }

    override fun rmDir(dir: Dir) {
        throw IllegalAccessException("文件不支持rmDir操作")
    }

    override fun clearDir() {
        throw IllegalAccessException("文件不支持clearDir操作")
    }

    override fun print() {
        println(getName())
    }

    override fun getFiles(): List<Dir> {
        throw IllegalAccessException("文件不支持getFiles操作")
    }
}