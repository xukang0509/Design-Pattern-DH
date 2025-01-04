package com.shanhai._4_Proxy;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/29 16:58
 */
public class Test {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("小美");

        Proxy proxy = new Proxy(mm);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
