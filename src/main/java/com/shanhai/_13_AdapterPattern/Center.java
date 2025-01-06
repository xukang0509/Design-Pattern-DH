package com.shanhai._13_AdapterPattern;

/**
 * @description: 中锋
 * @author: xu
 * @date: 2025/1/6 21:51
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋 " + super.name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋 " + super.name + " 防守");
    }
}
