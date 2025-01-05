package com.shanhai._11_AbstractFactory.db.database.sqlserver;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.table.Department;

/**
 * @description: 用于访问SQL Server的Department
 * @author: xu
 * @date: 2025/1/5 16:58
 */
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server中给Department表添加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL Server中根据部门ID得到Department表一条记录");
        return null;
    }
}
