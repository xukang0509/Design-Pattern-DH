package com.shanhai._24_Visitor;

/**
 * @description: 男人
 * @author: xu
 * @date: 2025/1/20 21:39
 */
public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
