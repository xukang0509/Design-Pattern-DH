package com.shanhai._11_AbstractFactory.cash.saleImp;

/**
 * @description: 打折收费
 * @author: xu
 * @date: 2024/12/29 16:18
 */
public class CashRebate extends CashSuper {
    private Double moneyRebate = 1.0d;

    // 初始化时必须输入折扣率，八折就输入0.8
    public CashRebate(Double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public Double acceptCash(Double price, int num) {
        Double result = price * num * this.moneyRebate;
        return super.acceptCash(result, 1);
    }
}
