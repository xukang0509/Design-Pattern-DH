package com.shanhai._0_JavaBase.specialSon;

import com.shanhai._0_JavaBase.action.IChange;
import com.shanhai._0_JavaBase.son.Cat;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/8 18:04
 */
public class MachineCat extends Cat implements IChange {
    public MachineCat() {
    }

    public MachineCat(String name) {
        super(name);
    }

    @Override
    protected String getShoutSound() {
        return "当当喵";
    }

    @Override
    public String changeThing(String thing) {
        return super.shout() + "我有万能口袋，我可变出" + thing;
    }
}
