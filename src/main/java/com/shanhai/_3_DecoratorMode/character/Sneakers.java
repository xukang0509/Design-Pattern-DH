package com.shanhai._3_DecoratorMode.character;

/**
 * @description: 球鞋
 * @author: xu
 * @date: 2024/12/29 15:38
 */
public class Sneakers extends Finery {
    @Override
    public void show() {
        System.out.print("球鞋 ");
        super.show();
    }
}
