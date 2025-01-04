package com.shanhai._10_ObserverPattern;

/**
 * @description: 看股票同事类
 * @author: xu
 * @date: 2025/1/1 17:23
 */
public class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    public void update() {
        System.out.println(String.format("%s：%s！%s，请关闭股票行情，赶紧工作。",
                super.sub.name, super.sub.getAction(), super.name));
    }
}
