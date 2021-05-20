package com.wxx.design.design_17_composite

/**
 * @author ：DELL on 2021/5/17 .
 * @packages ：com.wxx.design.design_17_composite .
 * TODO:一句话描述
 */
class Folder(name: String) : Dir(name) {
    override fun addDir(dir: Dir) {
        list.add(dir)
    }

    override fun rmDir(dir: Dir) {
        list.remove(dir)
    }

    override fun clearDir() {
        list.clear()
    }

    override fun print() {
        print(getName() + "(")
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            val next = iterator.next()
            next.print()
            if (iterator.hasNext()) {
                print(", ")
            }
        }
        print(")")
    }

    override fun getFiles(): List<Dir> {
        return list
    }
}