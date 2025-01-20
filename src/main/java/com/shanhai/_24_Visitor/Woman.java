package com.shanhai._24_Visitor;

/**
 * @description: 女人
 * @author: xu
 * @date: 2025/1/20 21:39
 */
public class Woman extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
