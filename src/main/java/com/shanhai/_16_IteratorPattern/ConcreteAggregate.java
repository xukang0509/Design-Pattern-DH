package com.shanhai._16_IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体聚集类
 * @author: xu
 * @date: 2025/1/12 16:16
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Iterator createIteratorDesc() {
        return new ConcreteDescIterator(this);
    }

    // 返回聚集总个数
    public int getCount() {
        return items.size();
    }

    // 增加新对象
    public void add(Object item) {
        items.add(item);
    }

    // 根据索引得到指定对象
    public Object getCurrentItem(int index) {
        return items.get(index);
    }
}
