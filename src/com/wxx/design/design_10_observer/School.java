package com.wxx.design.design_10_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TangRen
 * @create 2019-06-19 22:26
 * @TODO: 具体主题
 */
public class School implements Observable<Work> {
    private List<Observe<Work>> list = new ArrayList<>();

    @Override
    public void add(Observe<Work> observe) {
        if (!list.contains(observe)) {
            list.add(observe);
        }
    }

    @Override
    public void notify(Work work) {
        for (Observe<Work> workObserve : list) {
            workObserve.message(work);
        }
    }

    @Override
    public void remove(Observe<Work> observe) {
        if (list.contains(observe)) {
            list.remove(observe);
        }
    }
}
