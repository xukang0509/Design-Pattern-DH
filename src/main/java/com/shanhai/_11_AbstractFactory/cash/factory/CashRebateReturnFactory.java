package com.shanhai._11_AbstractFactory.cash.factory;

import com.shanhai._11_AbstractFactory.cash.ISale;
import com.shanhai._11_AbstractFactory.cash.ISaleFactory;
import com.shanhai._11_AbstractFactory.cash.saleImp.CashNormal;
import com.shanhai._11_AbstractFactory.cash.saleImp.CashRebate;
import com.shanhai._11_AbstractFactory.cash.saleImp.CashReturn;

/**
 * @description: 先打折 再满减 销售模式 工厂类
 * @author: xu
 * @date: 2024/12/29 18:21
 */
public class CashRebateReturnFactory implements ISaleFactory {
    private Double moneyRebate = 1d; // 折扣
    private Double moneyCondition = 0d; // 返利条件
    private Double moneyReturn = 0d; // 返利值

    public CashRebateReturnFactory(Double moneyRebate, Double moneyCondition, Double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public ISale createSalesModel() {
        CashRebate cashRebate = new CashRebate(moneyRebate); // 打折类
        CashReturn cashReturn = new CashReturn(moneyCondition, moneyReturn); // 满减类
        cashRebate.decorate(cashReturn); // 打折 装饰 满减
        cashReturn.decorate(new CashNormal()); // 满减 装饰 原价
        return cashRebate;
    }
}
