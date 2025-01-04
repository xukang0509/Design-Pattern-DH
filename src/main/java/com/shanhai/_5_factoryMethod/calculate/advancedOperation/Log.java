package com.shanhai._5_factoryMethod.calculate.advancedOperation;

import com.shanhai._5_factoryMethod.calculate.IOperation;

/**
 * @description: 对数运算类
 * @author: xu
 * @date: 2024/12/29 17:35
 */
public class Log implements IOperation {
    // 以 numberA 为底的 numberB 的对数
    @Override
    public Double calculate(Double numberA, Double numberB) {
        // 此处缺少两参数的有效性检测
        return Math.log(numberB) / Math.log(numberA);
    }
}
