package com.shanhai._3_DecoratorMode.cash;

/**
 * @description: 收费接口
 * @author: xu
 * @date: 2024/12/29 16:13
 */
public interface ISale {
    // 收取费用的方法，参数为单价和数量
    Double acceptCash(Double price, int num);
}
