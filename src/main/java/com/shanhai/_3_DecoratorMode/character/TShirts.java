package com.shanhai._3_DecoratorMode.character;

/**
 * @description: 大T恤
 * @author: xu
 * @date: 2024/12/29 15:38
 */
public class TShirts extends Finery {
    @Override
    public void show() {
        System.out.print("大T恤 ");
        super.show();
    }
}
