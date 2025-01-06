package com.shanhai._13_AdapterPattern;

/**
 * @description: 外籍中锋
 * @author: xu
 * @date: 2025/1/6 21:57
 */
public class ForeignCenter {
    private String name;

    public ForeignCenter(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("中锋 " + name + " 进攻");
    }

    public void 防守() {
        System.out.println("中锋 " + name + " 防守");
    }
}
