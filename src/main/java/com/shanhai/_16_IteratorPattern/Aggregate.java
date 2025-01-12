package com.shanhai._16_IteratorPattern;

/**
 * @description: 聚集接口
 * @author: xu
 * @date: 2025/1/12 16:16
 */
public interface Aggregate {
    // 创建迭代器
    Iterator createIterator();

    Iterator createIteratorDesc();
}
