package com.shanhai._2_StrategyPattern;

/**
 * @description: 收费类型枚举
 * @author: xu
 * @date: 2024/12/28 15:37
 */
public enum CashEnum {
    CASH_NORMAL(1, "正常收费"),

    CASH_REBATE_8(2, "打八折"),
    CASH_REBATE_7(3, "打七折"),

    CASH_RETURN_300_100(4, "满300减100"),

    CASH_RB_8_RT_300_100(5, "先打八折，再满300减100"),
    CASH_RT_200_50_RB_7(6, "先满200减50，再打七折"),
    ;

    private Integer cashType;
    private String cashMsg;

    CashEnum(Integer cashType, String cashMsg) {
        this.cashType = cashType;
        this.cashMsg = cashMsg;
    }

    public Integer getCashType() {
        return cashType;
    }

    public String getCashMsg() {
        return cashMsg;
    }
}
