package com.shanhai._19_CommandPattern;

/**
 * @description: 抽象命令类
 * @author: xu
 * @date: 2025/1/19 15:17
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    // 执行命令
    public abstract void executeCommand();
}
