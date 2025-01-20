package com.shanhai._23_Interpreter;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/20 21:19
 */
public class ExpressionFactory {
    public static Expression getExpression(String key) {
        return switch (key) {
            case "O" -> new Scale();
            case "C", "D", "E", "F", "G", "A", "B", "P" -> new Note();
            case "T" -> new Speed();
            default -> throw new IllegalStateException("Unexpected value: " + key);
        };
    }
}
