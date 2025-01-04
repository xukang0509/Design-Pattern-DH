package com.shanhai._9_BuilderPattern;

import java.awt.*;

/**
 * @description: 瘦小人建造者类
 * @author: xu
 * @date: 2025/1/1 17:03
 */
public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(Graphics graphics) {
        super(graphics);
    }

    @Override
    public void buildHead() {
        graphics.drawOval(150, 120, 30, 30);
    }

    @Override
    public void buildBody() {
        graphics.drawRect(160, 150, 10, 50);
    }

    @Override
    public void buildArmLeft() {
        graphics.drawLine(160, 150, 140, 200);
    }

    @Override
    public void buildArmRight() {
        graphics.drawLine(170, 150, 190, 200);
    }

    @Override
    public void buildLegLeft() {
        graphics.drawLine(160, 200, 145, 250);
    }

    @Override
    public void buildLegRight() {
        graphics.drawLine(170, 200, 185, 250);
    }
}
