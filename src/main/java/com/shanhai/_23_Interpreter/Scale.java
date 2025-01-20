package com.shanhai._23_Interpreter;

/**
 * @description: 音阶
 * @author: xu
 * @date: 2025/1/20 21:01
 */
public class Scale extends Expression {
    @Override
    public void execute(String key, double value) {
        String scale = switch ((int) value) {
            case 1 -> "低音";
            case 2 -> "中音";
            case 3 -> "高音";
            default -> throw new IllegalStateException("Unexpected value: " + (int) value);
        };
        System.out.print(scale + " ");
    }
}
