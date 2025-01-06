package com.shanhai._13_AdapterPattern;

/**
 * @description: 后卫
 * @author: xu
 * @date: 2025/1/6 21:51
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫 " + super.name + " 进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫 " + super.name + " 防守");
    }
}
