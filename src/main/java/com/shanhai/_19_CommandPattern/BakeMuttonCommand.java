package com.shanhai._19_CommandPattern;

/**
 * @description: 烤羊肉串命令类
 * @author: xu
 * @date: 2025/1/19 15:19
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
