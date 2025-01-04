package com.shanhai._5_factoryMethod.calculate;

import com.shanhai._5_factoryMethod.calculate.factory.FactoryAdvanced;
import com.shanhai._5_factoryMethod.calculate.factory.FactoryBasic;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/29 17:40
 */
public class OperationFactory {
    public static IOperation createOperation(String operate) {
        IOperation oper = null;
        IOperationFactory factory = null;
        switch (operate) {
            case "+":
            case "-":
            case "*":
            case "/":
                // 基础运算工厂实例
                factory = new FactoryBasic();
                break;
            case "pow":
            case "log":
                // 高级运算工厂实例
                factory = new FactoryAdvanced();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operate);
        }
        // 利用多态返回实际的运算类实例
        oper = factory.createOperation(operate);
        return oper;
    }
}
