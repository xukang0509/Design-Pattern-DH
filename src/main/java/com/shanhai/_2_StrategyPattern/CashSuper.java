package com.shanhai._2_StrategyPattern;

/**
 * @description: 收费抽象类
 * @author: xu
 * @date: 2024/12/28 15:17
 */
public abstract class CashSuper {
    // 收取费用的抽象方法，参数为单价和数量
    public abstract Double acceptCash(Double price, int num);
}
