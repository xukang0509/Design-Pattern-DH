package com.shanhai._3_DecoratorMode.cash;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/29 16:15
 */
public abstract class CashSuper implements ISale {
    private ISale component;

    // 装饰对象
    public void decorate(ISale component) {
        this.component = component;
    }

    @Override
    public Double acceptCash(Double price, int num) {
        Double result = 0.0d;
        if (component != null) {
            // 若装饰对象存在，则执行装饰的算法运算
            result = component.acceptCash(price, num);
        }
        return result;
    }
}
