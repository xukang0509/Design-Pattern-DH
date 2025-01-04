package com.shanhai._8_FacadePattern;

/**
 * @description: 基金类，它需要了解所有的股票或者其他投资方式的方法或属性，进行组合，以备外界调用
 * @author: xu
 * @date: 2025/1/1 16:24
 */
public class Fund {
    private Stock1 stock1;
    private Stock2 stock2;
    private NationalDebt1 nd1;
    private Realty1 rt1;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        nd1 = new NationalDebt1();
        rt1 = new Realty1();
    }

    public void buyFund() {
        stock1.buy();
        stock2.buy();
        nd1.buy();
        rt1.buy();
    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        nd1.sell();
        rt1.sell();
    }

    // 基金很多买入卖出操作，持仓比例等，无须提前告知客户
}
