package com.shanhai._13_AdapterPattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/6 21:54
 */
public class Client {
    public static void main(String[] args) {
        Player forwards = new Forwards("巴蒂尔");
        forwards.attack();

        Player guards = new Guards("麦克格雷迪");
        guards.attack();

        Player center = new Translator("姚明");
        center.attack();
        center.defense();
    }
}
