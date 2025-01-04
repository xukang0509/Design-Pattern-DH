package com.shanhai._5_factoryMethod.cash;

import com.shanhai._2_StrategyPattern.CashEnum;
import com.shanhai._5_factoryMethod.cash.factory.CashRebateReturnFactory;
import com.shanhai._5_factoryMethod.cash.factory.CashReturnRebateFactory;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/28 16:11
 */
public class CashContext {
    private static final Map<Integer, CashEnum> CASH_ENUM_MAP = new HashMap<>();

    static {
        Class<CashEnum> cashEnumClass = CashEnum.class;
        Field[] fields = cashEnumClass.getFields();
        for (Field field : fields) {
            CashEnum cashEnum = CashEnum.valueOf(field.getName());
            CASH_ENUM_MAP.put(cashEnum.getCashType(), cashEnum);
        }
    }

    // 声明一个 ISale 对象
    private ISale sale;

    // 通过构造方法，传入具体的收费策略
    public CashContext(int cashType) {
        ISaleFactory saleFactory = null;
        switch (CASH_ENUM_MAP.get(cashType)) {
            case CASH_NORMAL -> saleFactory = new CashRebateReturnFactory(1d, 0d, 0d);
            case CASH_REBATE_8 -> saleFactory = new CashRebateReturnFactory(0.8d, 0d, 0d);
            case CASH_REBATE_7 -> saleFactory = new CashRebateReturnFactory(0.7d, 0d, 0d);
            case CASH_RETURN_300_100 -> saleFactory = new CashReturnRebateFactory(1d, 300d, 100d);
            case CASH_RB_8_RT_300_100 -> saleFactory = new CashRebateReturnFactory(0.8d, 300d, 100d);
            case CASH_RT_200_50_RB_7 -> saleFactory = new CashReturnRebateFactory(0.7d, 200d, 50d);
            default -> throw new IllegalStateException("Unexpected value: " + cashType);
        }
        this.sale = saleFactory.createSalesModel();
    }

    public Double acceptCash(Double price, int num) {
        return this.sale.acceptCash(price, num);
    }
}
