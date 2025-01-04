package com.shanhai._2_StrategyPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/28 15:36
 */
public class CashFactory {

    private static final Map<Integer, CashEnum> CASH_ENUM_MAP = new HashMap<Integer, CashEnum>();

    static {
        CASH_ENUM_MAP.put(1, CashEnum.CASH_NORMAL);
        CASH_ENUM_MAP.put(2, CashEnum.CASH_REBATE_8);
        CASH_ENUM_MAP.put(3, CashEnum.CASH_REBATE_7);
        CASH_ENUM_MAP.put(4, CashEnum.CASH_RETURN_300_100);
    }

    public static CashSuper createCashAccept(int cashType) {
        CashSuper cs = null;
        switch (CASH_ENUM_MAP.get(cashType)) {
            case CASH_NORMAL -> cs = new CashNormal();
            case CASH_REBATE_8 -> cs = new CashRebate(0.8d);
            case CASH_REBATE_7 -> cs = new CashRebate(0.7d);
            case CASH_RETURN_300_100 -> cs = new CashReturn(300d, 100d);
            default -> throw new IllegalStateException("Unexpected value: " + cashType);
        }
        return cs;
    }
}
