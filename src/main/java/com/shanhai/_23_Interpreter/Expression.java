package com.shanhai._23_Interpreter;

/**
 * @description: 抽象表达式类
 * @author: xu
 * @date: 2025/1/20 20:47
 */
public abstract class Expression {
    public void interpret(PlayContext context) {
        if (context.getPlayText().isBlank()) {
            return;
        }
        String payKey = context.getPlayText().substring(0, 1);
        context.setPlayText(context.getPlayText().substring(2));

        double playValue = Double.parseDouble(context.getPlayText().substring(0, context.getPlayText().indexOf(" ")));
        context.setPlayText(context.getPlayText().substring(context.getPlayText().indexOf(" ") + 1));

        execute(payKey, playValue);
    }

    public abstract void execute(String key, double value);
}
