package com.wxx.design.design_10_observer;

import java.util.Date;

/**
 * @author TangRen
 * @create 2019-06-19 22:16
 * @TODO: 实体类
 */
public class Work {
    private boolean isTeacher;
    private String name;
    private String pushDate;
    private String task;

    public Work(boolean isTeacher, String name, String pushDate, String task) {
        this.isTeacher = isTeacher;
        this.name = name;
        this.pushDate = pushDate;
        this.task = task;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public void setTeacher(boolean teacher) {
        isTeacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPushDate() {
        return pushDate;
    }

    public void setPushDate(String pushDate) {
        this.pushDate = pushDate;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return String.format("%1s 在 %2s %3s %4s 作业", name, pushDate, isTeacher ? "布置了" : "收到了", task);
    }
}
