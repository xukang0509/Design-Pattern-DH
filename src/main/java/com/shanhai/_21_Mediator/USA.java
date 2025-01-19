package com.shanhai._21_Mediator;

/**
 * @description: 美国
 * @author: xu
 * @date: 2025/1/19 16:49
 */
public class USA extends Country {
    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    // 发布声明
    public void declare(String message) {
        unitedNations.declare(message, this);
    }

    // 接收消息
    public void getMessage(String message) {
        System.out.println("美国获得对方消息：" + message);
    }
}
