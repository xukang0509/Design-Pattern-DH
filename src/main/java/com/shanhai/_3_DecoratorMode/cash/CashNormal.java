package com.shanhai._3_DecoratorMode.cash;

/**
 * @description: 正常收费
 * @author: xu
 * @date: 2024/12/29 16:14
 */
public class CashNormal implements ISale {
    // 原价返回
    @Override
    public Double acceptCash(Double price, int num) {
        return price * num;
    }
}
