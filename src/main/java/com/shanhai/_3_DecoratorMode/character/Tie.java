package com.shanhai._3_DecoratorMode.character;

/**
 * @description: 领带
 * @author: xu
 * @date: 2024/12/29 15:38
 */
public class Tie extends Finery {
    @Override
    public void show() {
        System.out.print("领带 ");
        super.show();
    }
}
