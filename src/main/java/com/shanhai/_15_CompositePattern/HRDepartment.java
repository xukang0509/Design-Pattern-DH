package com.shanhai._15_CompositePattern;

/**
 * @description: 人力资源部，树叶节点
 * @author: xu
 * @date: 2025/1/8 21:41
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
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
        System.out.println(name + " 员工招聘培训管理");
    }
}
