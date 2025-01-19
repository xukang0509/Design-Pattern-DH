package com.shanhai._19_CommandPattern;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description: 服务员类
 * @author: xu
 * @date: 2025/1/19 15:21
 */
public class Waiter {
    private List<Command> orders = new ArrayList<>();

    // 设置订单
    public void setOrder(Command command) {
        String className = command.getClass().getSimpleName();
        if ("BakeChickenWingCommand".equals(className)) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + className + " 时间：" + getNowTime());
        }
    }

    // 取消订单
    public void cancelOrder(Command command) {
        String className = command.getClass().getSimpleName();
        orders.remove(command);
        System.out.println("取消订单：" + className + " 时间：" + getNowTime());
    }

    // 通知执行
    public void notifyCommand() {
        orders.forEach(Command::executeCommand);
    }

    private String getNowTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date());
    }
}
