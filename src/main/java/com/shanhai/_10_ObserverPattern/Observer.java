package com.shanhai._10_ObserverPattern;

/**
 * @description: 观察者抽象类
 * @author: xu
 * @date: 2025/1/1 17:40
 */
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    protected abstract void update();
}
