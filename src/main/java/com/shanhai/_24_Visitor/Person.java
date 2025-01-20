package com.shanhai._24_Visitor;

/**
 * @description: 人类抽象类
 * @author: xu
 * @date: 2025/1/20 21:38
 */
public abstract class Person {
    // 接受
    public abstract void accept(Action visitor);
}
