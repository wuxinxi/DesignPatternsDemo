package com.wxx.design.design_01_single;

/**
 * @author TangRen
 * @create 2019-06-16 21:10
 * @TODO: 推荐使用的单例模式方式
 * 第一次加载Singleton时并不会初始化instance,而是在调用getInstance()的时候虚拟机会去加载SingletonHolder类，不仅保证了线程安全，
 * 也保证了单例对象的唯一性，同时也延迟了单例的实例化，所以推荐使用
 */
public class Singleton {
    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}
