package com.shanhai._3_DecoratorMode.cash;

/**
 * @description: 返利收费
 * @author: xu
 * @date: 2024/12/29 16:20
 */
public class CashReturn extends CashSuper {
    private Double moneyCondition; // 返利条件
    private Double moneyReturn; // 返利值

    // 返利收费。初始化时需要输入返利条件和返利值
    // 比如"满300返100"，就是moneyCondition=300,moneyReturn=100
    public CashReturn(Double moneyCondition, Double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    // 计算收费时，当达到返利条件，就原价减去返利值
    @Override
    public Double acceptCash(Double price, int num) {
        Double result = price * num;
        if (moneyCondition > 0 && result >= moneyCondition) {
            result -= Math.floor(result / moneyCondition) * moneyReturn;
        }
        return super.acceptCash(result, 1);
    }
}
