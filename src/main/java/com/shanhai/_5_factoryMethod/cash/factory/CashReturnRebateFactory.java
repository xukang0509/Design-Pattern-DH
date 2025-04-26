package com.shanhai._5_factoryMethod.cash.factory;

import com.shanhai._5_factoryMethod.cash.ISale;
import com.shanhai._5_factoryMethod.cash.ISaleFactory;
import com.shanhai._5_factoryMethod.cash.saleImp.CashNormal;
import com.shanhai._5_factoryMethod.cash.saleImp.CashRebate;
import com.shanhai._5_factoryMethod.cash.saleImp.CashReturn;

/**
 * @description: 先满减 再打折 销售模式 工厂类
 * @author: xu
 * @date: 2024/12/29 18:25
 */
@SuppressWarnings("all")
public class CashReturnRebateFactory implements ISaleFactory {
    private Double moneyRebate = 1.0d; // 折扣
    private Double moneyCondition = 0d; // 返利条件
    private Double moneyReturn = 0d; // 返利值

    public CashReturnRebateFactory(Double moneyRebate, Double moneyCondition, Double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public ISale createSalesModel() {
        CashReturn cashReturn = new CashReturn(moneyCondition, moneyReturn); // 满减类
        CashRebate cashRebate = new CashRebate(moneyRebate); // 打折类
        cashReturn.decorate(cashRebate); // 满减 装饰 打折
        cashRebate.decorate(new CashNormal()); // 打折 装饰 原价
        return cashReturn;
    }
}
