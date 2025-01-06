package com.shanhai._13_AdapterPattern;

/**
 * @description: 球员抽象类
 * @author: xu
 * @date: 2025/1/6 21:49
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    // 进攻
    public abstract void attack();

    // 防守
    public abstract void defense();
}
