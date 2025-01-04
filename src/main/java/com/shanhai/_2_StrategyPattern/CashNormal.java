package com.shanhai._2_StrategyPattern;

/**
 * @description: 正常收费
 * @author: xu
 * @date: 2024/12/28 15:18
 */
public class CashNormal extends CashSuper {
    // 原价返回
    @Override
    public Double acceptCash(Double price, int num) {
        return price * num;
    }
}
