package com.wxx.design.design_10_observer;

/**
 * @author TangRen
 * @create 2019-06-19 22:14
 * @TODO: 抽象观察者
 */
public interface Observe<T> {
    public void message(T t);
}
