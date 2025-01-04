package com.shanhai._0_JavaBase.specialSon;

import com.shanhai._0_JavaBase.action.IChange;
import com.shanhai._0_JavaBase.son.Monkey;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/8 18:04
 */
public class StoneMonkey extends Monkey implements IChange {
    public StoneMonkey() {
    }

    public StoneMonkey(String name) {
        super(name);
    }

    @Override
    protected String getShoutSound() {
        return "俺老孙来也";
    }

    @Override
    public String changeThing(String thing) {
        return super.shout() + "我会七十二变，可变出" + thing;
    }
}
