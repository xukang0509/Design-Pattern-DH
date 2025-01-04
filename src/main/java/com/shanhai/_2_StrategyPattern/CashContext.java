package com.shanhai._2_StrategyPattern;

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

    // 声明一个CashSuper 对象
    private CashSuper cs;

    // 通过构造方法，传入具体的收费策略
    public CashContext(int cashType) {
        switch (CASH_ENUM_MAP.get(cashType)) {
            case CASH_NORMAL -> this.cs = new CashNormal();
            case CASH_REBATE_8 -> this.cs = new CashRebate(0.8d);
            case CASH_REBATE_7 -> this.cs = new CashRebate(0.7d);
            case CASH_RETURN_300_100 -> this.cs = new CashReturn(300d, 100d);
            case CASH_RB_8_RT_300_100 -> this.cs = new CashReturnRebate(0.8d, 300d, 100d);
            default -> throw new IllegalStateException("Unexpected value: " + cashType);
        }
    }

    public Double acceptCash(Double price, int num) {
        return this.cs.acceptCash(price, num);
    }
}
