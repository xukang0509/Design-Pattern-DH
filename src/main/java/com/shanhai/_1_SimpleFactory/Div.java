package com.shanhai._1_SimpleFactory;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/28 14:40
 */
public class Div extends Operation {
    @Override
    public Double calculate(Double numberA, Double numberB) {
        if (numberB == 0) {
            System.out.println("除数不能为0");
            throw new ArithmeticException("除数不能为0");
        }
        return numberA / numberB;
    }
}
