package com.shanhai._5_factoryMethod.calculate.baiscOperation;

import com.shanhai._5_factoryMethod.calculate.IOperation;

/**
 * @description: 加法运算实现类
 * @author: xu
 * @date: 2024/12/28 14:40
 */
public class Add implements IOperation {
    @Override
    public Double calculate(Double numberA, Double numberB) {
        return numberA + numberB;
    }
}
