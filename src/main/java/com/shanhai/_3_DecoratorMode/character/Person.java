package com.shanhai._3_DecoratorMode.character;

/**
 * @description: 具体人物
 * @author: xu
 * @date: 2024/12/29 15:35
 */
public class Person implements ICharacter {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.print("装扮的" + name);
    }
}
