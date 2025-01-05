package com.shanhai._11_AbstractFactory.db.database.sqlserver;

import com.shanhai._11_AbstractFactory.db.database.IUser;
import com.shanhai._11_AbstractFactory.db.table.User;

/**
 * @description: 用于访问SQL Server的User
 * @author: xu
 * @date: 2025/1/5 16:39
 */
public class SqlserverUser implements IUser {
    // 新增一个用户
    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表添加一条记录");
    }

    // 获取一个用户信息
    @Override
    public User getUser(Integer id) {
        System.out.println("在SQL Server中根据用户ID得到User表一条记录");
        return null;
    }
}
