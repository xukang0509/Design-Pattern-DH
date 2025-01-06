package com.shanhai._13_AdapterPattern;

/**
 * @description: 翻译官
 * @author: xu
 * @date: 2025/1/6 21:58
 */
public class Translator extends Player {
    private ForeignCenter foreignCenter;

    public Translator(String name) {
        super(name);
        foreignCenter = new ForeignCenter(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}
