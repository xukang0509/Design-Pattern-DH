package com.shanhai._11_AbstractFactory.db.database.access;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.table.Department;

/**
 * @description: 用于访问Access的Department
 * @author: xu
 * @date: 2025/1/5 16:58
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department表添加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Access中根据部门ID得到Department表一条记录");
        return null;
    }
}
