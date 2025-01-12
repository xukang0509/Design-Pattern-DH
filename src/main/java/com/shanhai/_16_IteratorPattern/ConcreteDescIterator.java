package com.shanhai._16_IteratorPattern;

/**
 * @description: 具体迭代器类
 * @author: xu
 * @date: 2025/1/12 16:14
 */
public class ConcreteDescIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current;

    // 初始化时将具体的聚集对象传入
    public ConcreteDescIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.current = aggregate.getCount() - 1;
    }

    @Override
    public Object first() {
        return aggregate.getCurrentItem(aggregate.getCount() - 1);
    }

    @Override
    public Object next() {
        Object res = null;
        if (--current >= 0) {
            res = aggregate.getCurrentItem(current);
        }
        return res;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object currentItem() {
        return aggregate.getCurrentItem(current);
    }
}
