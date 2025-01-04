package com.shanhai._9_BuilderPattern;

import java.awt.*;

/**
 * @description: 抽象的建造者类
 * @author: xu
 * @date: 2025/1/1 16:58
 */
public abstract class PersonBuilder {
    protected Graphics graphics;

    public PersonBuilder(Graphics graphics) {
        this.graphics = graphics;
    }

    // 头
    public abstract void buildHead();

    // 身体
    public abstract void buildBody();

    // 左手
    public abstract void buildArmLeft();

    // 右手
    public abstract void buildArmRight();

    // 左脚
    public abstract void buildLegLeft();

    // 右脚
    public abstract void buildLegRight();
}
