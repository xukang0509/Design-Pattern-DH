package com.shanhai._10_ObserverPattern;

/**
 * @description: 看NBA同事类
 * @author: xu
 * @date: 2025/1/1 17:23
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s：%s！%s，请关闭NBA直播，赶紧工作。",
                super.sub.name, super.sub.getAction(), super.name));
    }
}
