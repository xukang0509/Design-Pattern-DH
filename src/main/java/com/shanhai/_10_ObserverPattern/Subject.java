package com.shanhai._10_ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 通知者抽象类
 * @author: xu
 * @date: 2025/1/1 17:42
 */
public abstract class Subject {
    protected String name;
    // 同事列表
    private List<Observer> list = new ArrayList<>();
    // 状态
    private String action;

    public Subject(String name) {
        this.name = name;
    }

    // 添加同事
    public void attach(Observer observer) {
        list.add(observer);
    }

    // 删除同事
    public void detach(Observer observer) {
        list.remove(observer);
    }

    // 通知同事
    public void notifyEmployee() {
        // 待老板来了，就给所有登记过的同事发通知
        for (Observer emp : list) {
            emp.update();
        }
    }

    // 得到状态
    public String getAction() {
        return action;
    }

    // 设置状态：就是设置具体通知的话
    public void setAction(String action) {
        this.action = action;
    }
}
