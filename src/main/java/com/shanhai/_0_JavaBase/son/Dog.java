package com.shanhai._0_JavaBase.son;

import com.shanhai._0_JavaBase.base.Animal;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/8 16:16
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super();
    }

    @Override
    protected String getShoutSound() {
        return "汪";
    }
}
