package com.wxx.design.design_10_observer;

/**
 * @author TangRen
 * @create 2019-06-19 22:30
 * @TODO: 测试主函数
 */
public class Main {
    public static void main(String[] args) {
        Observable<Work> observable = new School();
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        Student student = new Student();

        observable.add(teacher1);
        observable.add(teacher2);
        observable.add(student);

        observable.notify(new Work(true, "刘老师", "2016-06-19 22:23", "背书"));

    }
}
