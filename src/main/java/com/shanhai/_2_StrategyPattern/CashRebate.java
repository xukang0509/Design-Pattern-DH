package com.shanhai._2_StrategyPattern;

/**
 * @description: 打折收费
 * @author: xu
 * @date: 2024/12/28 15:20
 */
public class CashRebate extends CashSuper {
    private Double moneyRebate = 1.0d;

    // 初始化时必须输入折扣率，八折就输入0.8
    public CashRebate(Double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    // 计算收费时需要在原价基础上乘以折扣率
    @Override
    public Double acceptCash(Double price, int num) {
        return price * num * this.moneyRebate;
    }
}
