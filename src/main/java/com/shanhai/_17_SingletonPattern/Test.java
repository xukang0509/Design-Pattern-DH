package com.shanhai._17_SingletonPattern;

import javax.swing.*;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/12 16:42
 */
public class Test {
    public static void main(String[] args) {
        new SingletonWindow();
    }
}

class SingletonWindow {
    public SingletonWindow() {
        JFrame frame = new JFrame("单例模式");
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JButton button = new JButton("打开工具箱");
        button.setBounds(10, 10, 120, 25);
        button.addActionListener(new ToolkitListener());
        panel.add(button);

        JButton button2 = new JButton("打开工具箱2");
        button2.setBounds(160, 10, 120, 25);
        button2.addActionListener(new ToolkitListener());
        panel.add(button2);

        frame.setVisible(true);
    }
}
