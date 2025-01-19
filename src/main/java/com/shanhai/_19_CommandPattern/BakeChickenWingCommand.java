package com.shanhai._19_CommandPattern;

/**
 * @description: 烤鸡翅命令类
 * @author: xu
 * @date: 2025/1/19 15:19
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeChickenWing();
    }
}
