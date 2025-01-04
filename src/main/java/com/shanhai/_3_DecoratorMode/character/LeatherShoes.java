package com.shanhai._3_DecoratorMode.character;

/**
 * @description: 皮鞋
 * @author: xu
 * @date: 2024/12/29 15:38
 */
public class LeatherShoes extends Finery {
    @Override
    public void show() {
        System.out.print("皮鞋 ");
        super.show();
    }
}
