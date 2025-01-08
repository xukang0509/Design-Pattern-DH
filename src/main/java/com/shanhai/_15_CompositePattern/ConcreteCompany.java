package com.shanhai._15_CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体分公司类，树枝节点
 * @author: xu
 * @date: 2025/1/8 21:36
 */
public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Company child : children) {
            child.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        children.forEach(Company::lineOfDuty);
    }
}
