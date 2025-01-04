package com.shanhai._1_SimpleFactory;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/28 14:47
 */
public class OperationFactory {
    public static Operation createOperation(String operation) {
        Operation oper = null;
        switch (operation) {
            case "+" -> oper = new Add();
            case "-" -> oper = new Sub();
            case "*" -> oper = new Mul();
            case "/" -> oper = new Div();
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        }
        return oper;
    }
}
