package com.shanhai._23_Interpreter;

/**
 * @description: 音符类
 * @author: xu
 * @date: 2025/1/20 20:56
 */
public class Note extends Expression {
    @Override
    public void execute(String key, double value) {
        String note = switch (key) {
            case "C" -> "1";
            case "D" -> "2";
            case "E" -> "3";
            case "F" -> "4";
            case "G" -> "5";
            case "A" -> "6";
            case "B" -> "7";
            default -> throw new IllegalStateException("Unexpected value: " + key);
        };
        System.out.print(note + " ");
    }
}
