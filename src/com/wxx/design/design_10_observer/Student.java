package com.wxx.design.design_10_observer;

/**
 * @author TangRen
 * @create 2019-06-19 22:15
 * @TODO: 具体观察者
 */
public class Student implements Observe<Work> {

    @Override
    public void message(Work work) {
        System.out.println("work = " + work);
    }
}
