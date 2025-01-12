package com.shanhai._16_IteratorPattern;

/**
 * @description: 迭代器接口
 * @author: xu
 * @date: 2025/1/12 16:13
 */
public interface Iterator {
    // 得到第一个对象
    Object first();

    // 得到下一个对象
    Object next();

    // 是否到最后
    boolean isDone();

    // 当前对象
    Object currentItem();
}
