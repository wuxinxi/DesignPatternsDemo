package com.wxx.design.design_01_single;

/**
 * @author TangRen
 * @create 2019-06-16 21:34
 * @TODO: 枚举单例
 * 简单，而且反序列化后也是单例，其他方式反序列化后会生成多个对象
 */
public enum SingletonEnum {
    INSTANCE;

    public void doSth() {
        System.out.println("SingletonEnum.doSth");
    }

}
