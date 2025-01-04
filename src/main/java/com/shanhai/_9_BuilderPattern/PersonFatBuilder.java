package com.shanhai._9_BuilderPattern;

import java.awt.*;

/**
 * @description: 胖小人建造者类
 * @author: xu
 * @date: 2025/1/1 17:05
 */
public class PersonFatBuilder extends PersonBuilder {
    public PersonFatBuilder(Graphics graphics) {
        super(graphics);
    }

    @Override
    public void buildHead() {
        graphics.drawOval(250, 120, 30, 30);
    }

    @Override
    public void buildBody() {
        graphics.drawOval(245, 150, 40, 50);
    }

    @Override
    public void buildArmLeft() {
        graphics.drawLine(250, 150, 230, 200);
    }

    @Override
    public void buildArmRight() {
        graphics.drawLine(280, 150, 300, 200);
    }

    @Override
    public void buildLegLeft() {
        graphics.drawLine(260, 200, 245, 250);
    }

    @Override
    public void buildLegRight() {
        graphics.drawLine(270, 200, 285, 250);
    }
}
