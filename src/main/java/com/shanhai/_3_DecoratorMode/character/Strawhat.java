package com.shanhai._3_DecoratorMode.character;

/**
 * @description: 草帽
 * @author: xu
 * @date: 2024/12/29 15:38
 */
public class Strawhat extends Finery {
    @Override
    public void show() {
        System.out.print("草帽 ");
        super.show();
    }
}
