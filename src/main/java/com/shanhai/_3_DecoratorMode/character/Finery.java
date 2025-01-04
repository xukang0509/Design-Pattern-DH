package com.shanhai._3_DecoratorMode.character;

/**
 * @description: 服饰类
 * @author: xu
 * @date: 2024/12/29 15:36
 */
public abstract class Finery implements ICharacter {
    private ICharacter component;

    public void decorate(ICharacter component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (this.component != null) {
            this.component.show();
        }
    }
}
