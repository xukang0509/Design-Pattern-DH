package com.shanhai._8_FacadePattern;

/**
 * @description: 客户
 * @author: xu
 * @date: 2025/1/1 16:29
 */
public class Client {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
