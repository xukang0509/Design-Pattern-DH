package com.shanhai._23_Interpreter;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/20 21:04
 */
public class Client {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        System.out.println("音乐-上海滩！");
        context.setPlayText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 T 1000 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");

        Expression expression = null;
        while (!context.getPlayText().isBlank()) {
            String str = context.getPlayText().substring(0, 1);
            expression = ExpressionFactory.getExpression(str);
            expression.interpret(context);
        }
        System.out.println();
    }
}
