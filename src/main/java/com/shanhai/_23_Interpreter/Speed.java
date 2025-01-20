package com.shanhai._23_Interpreter;

/**
 * @description: 音速
 * @author: xu
 * @date: 2025/1/20 21:15
 */
public class Speed extends Expression {
    @Override
    public void execute(String key, double value) {
        String speed = null;
        if (value < 500) {
            speed = "快速";
        } else if (value < 1000) {
            speed = "中速";
        } else {
            speed = "慢速";
        }
        System.out.print(speed + " ");
    }
}
