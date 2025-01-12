package com.shanhai._17_SingletonPattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @description: 工具箱事件类
 * @author: xu
 * @date: 2025/1/12 16:58
 */
public class ToolkitListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Toolkit.getInstance();
    }
}
