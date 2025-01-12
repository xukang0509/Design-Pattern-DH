package com.shanhai._17_SingletonPattern;

import javax.swing.*;

/**
 * @description: 工具箱类
 * @author: xu
 * @date: 2025/1/12 17:06
 */
public class Toolkit extends JFrame {
    private static Toolkit instance;

    private Toolkit(String title) {
        super(title);
    }

    public static Toolkit getInstance() {
        if (instance == null || !instance.isVisible()) {
            synchronized (Toolkit.class) {
                if (instance == null || !instance.isVisible()) {
                    instance = new Toolkit("工具箱");
                    instance.setSize(150, 300);
                    instance.setLocation(150, 150);
                    instance.setResizable(false);
                    instance.setAlwaysOnTop(true);
                    instance.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    instance.setVisible(true);
                }
            }
        }
        return instance;
    }
}
