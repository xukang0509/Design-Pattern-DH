package com.shanhai._5_factoryMethod.calculate.advancedOperation;

import com.shanhai._5_factoryMethod.calculate.IOperation;

/**
 * @description: 指数运算类
 * @author: xu
 * @date: 2024/12/29 17:34
 */
public class Pow implements IOperation {
    // 求 numberA 的 numberB 次方
    @Override
    public Double calculate(Double numberA, Double numberB) {
        // 此处缺少两参数的有效性检测
        return Math.pow(numberA, numberB);
    }
}
