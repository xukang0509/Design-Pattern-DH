package com.shanhai._16_IteratorPattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/12 16:26
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate bus = new ConcreteAggregate();
        bus.add("大鸟");
        bus.add("小帅");
        bus.add("行李");
        bus.add("老外");
        bus.add("公交内部人员");
        bus.add("小偷");

        //Iterator conductor = bus.createIterator();
        Iterator conductor = bus.createIteratorDesc();
        while (!conductor.isDone()) {
            System.out.println(conductor.currentItem() + "，请买车票！");
            conductor.next();
        }
    }
}
