package com.shanhai._15_CompositePattern;

/**
 * @description: 公司抽象类
 * @author: xu
 * @date: 2025/1/8 21:32
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    // 添加
    public abstract void add(Company company);

    // 移除
    public abstract void remove(Company company);

    // 显示
    public abstract void display(int depth);

    // 履行职责
    // 不同的公司不同的部门履行不同的职责
    public abstract void lineOfDuty();
}
