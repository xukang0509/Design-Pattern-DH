package com.shanhai._2_StrategyPattern;

/**
 * @description: 先折扣，再返利
 * @author: xu
 * @date: 2024/12/29 15:59
 */
public class CashReturnRebate extends CashSuper {
    private Double moneyRebate = 1.0d; // 折扣
    private Double moneyCondition; // 返利条件
    private Double moneyReturn; // 返利值

    // 先折扣，再返利。初始化时需要折扣参数，再输入返利条件和返利值
    // 比如"先八折，再满300返100"，就是 moneyRebate=0.8, moneyCondition=300, moneyReturn=100
    public CashReturnRebate(Double moneyRebate, Double moneyCondition, Double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public Double acceptCash(Double price, int num) {
        Double result = price * num * moneyRebate;
        if (moneyCondition > 0 && result >= moneyCondition) {
            result -= Math.floor(result / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
