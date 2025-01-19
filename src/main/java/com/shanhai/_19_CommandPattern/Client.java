package com.shanhai._19_CommandPattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/19 15:30
 */
@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) {
        // 开店前的准备
        Barbecuer boy = new Barbecuer(); // 烤肉厨师
        Command backMuttonCommand = new BakeMuttonCommand(boy); // 烤羊肉串
        Command backChickenWingCommand = new BakeChickenWingCommand(boy); // 烤鸡翅
        Waiter girl = new Waiter(); // 服务员

        System.out.println("开门营业，顾客点菜！");
        girl.setOrder(backMuttonCommand); // 下单点羊肉串
        girl.setOrder(backMuttonCommand); // 下单点羊肉串
        girl.setOrder(backMuttonCommand); // 下单点羊肉串
        girl.setOrder(backMuttonCommand); // 下单点羊肉串
        girl.setOrder(backMuttonCommand); // 下单点羊肉串

        girl.cancelOrder(backMuttonCommand); // 取消一串羊肉串订单

        girl.setOrder(backChickenWingCommand); // 下单烤鸡翅

        System.out.println("点菜完毕，通知厨房烧菜！");
        girl.notifyCommand();
    }
}
