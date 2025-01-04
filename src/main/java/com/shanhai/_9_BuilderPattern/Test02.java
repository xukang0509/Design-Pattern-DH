package com.shanhai._9_BuilderPattern;

import javax.swing.*;
import java.awt.*;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/1 17:10
 */
public class Test02 extends JFrame {
    public Test02() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        PersonBuilder gThin = new PersonThinBuilder(g);
        PersonDirector pdThin = new PersonDirector(gThin);
        pdThin.buildPerson();

        PersonBuilder gFat = new PersonFatBuilder(g);
        PersonDirector pdFat = new PersonDirector(gFat);
        pdFat.buildPerson();
    }

    public static void main(String[] args) {
        new Test02().setVisible(true);
    }
}
