package com.shanhai._16_IteratorPattern;

/**
 * @description: 具体迭代器类
 * @author: xu
 * @date: 2025/1/12 16:14
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    // 初始化时将具体的聚集对象传入
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getCurrentItem(0);
    }

    @Override
    public Object next() {
        Object res = null;
        if (++current < aggregate.getCount()) {
            res = aggregate.getCurrentItem(current);
        }
        return res;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount();
    }

    @Override
    public Object currentItem() {
        return aggregate.getCurrentItem(current);
    }
}
