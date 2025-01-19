package com.shanhai._21_Mediator;

/**
 * @description: 伊拉克
 * @author: xu
 * @date: 2025/1/19 16:49
 */
public class Iraq extends Country {
    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    // 发布声明
    public void declare(String message) {
        unitedNations.declare(message, this);
    }

    // 接收消息
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息：" + message);
    }
}
