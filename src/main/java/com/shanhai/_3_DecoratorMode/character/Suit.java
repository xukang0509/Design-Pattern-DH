package com.shanhai._3_DecoratorMode.character;

/**
 * @description: 西装
 * @author: xu
 * @date: 2024/12/29 15:38
 */
public class Suit extends Finery {
    @Override
    public void show() {
        System.out.print("西装 ");
        super.show();
    }
}
