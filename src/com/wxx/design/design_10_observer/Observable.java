package com.wxx.design.design_10_observer;

/**
 * @author TangRen
 * @create 2019-06-19 22:24
 * @TODO: 抽象主题
 */
public interface Observable<T> {
    void add(Observe<T> observe);

    void notify(T t);

    void remove(Observe<T> observe);
}
