package com.shanhai._15_CompositePattern;

/**
 * @description: 财务部，树叶节点
 * @author: xu
 * @date: 2025/1/8 21:41
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }
    
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 公司财务收支管理");
    }
}
