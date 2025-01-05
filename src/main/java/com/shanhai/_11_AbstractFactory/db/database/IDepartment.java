package com.shanhai._11_AbstractFactory.db.database;

import com.shanhai._11_AbstractFactory.db.table.Department;

/**
 * @description: 部门类接口
 * @author: xu
 * @date: 2025/1/5 16:56
 */
public interface IDepartment {
    // 新增部门
    void insert(Department department);

    // 获取一个部门信息
    Department getDepartment(int id);
}
