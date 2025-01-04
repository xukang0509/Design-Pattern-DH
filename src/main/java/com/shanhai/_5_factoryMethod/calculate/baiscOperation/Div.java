package com.shanhai._5_factoryMethod.calculate.baiscOperation;

import com.shanhai._5_factoryMethod.calculate.IOperation;

/**
 * @description: 除法运算实现类
 * @author: xu
 * @date: 2024/12/28 14:40
 */
public class Div implements IOperation {
    @Override
    public Double calculate(Double numberA, Double numberB) {
        if (numberB == 0) {
            System.out.println("除数不能为0");
            throw new ArithmeticException("除数不能为0");
        }
        return numberA / numberB;
    }
}
