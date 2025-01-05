package com.shanhai._11_AbstractFactory.db.database.access;

import com.shanhai._11_AbstractFactory.db.database.IUser;
import com.shanhai._11_AbstractFactory.db.table.User;

/**
 * @description: 用于访问Access的User
 * @author: xu
 * @date: 2025/1/5 16:39
 */
public class AccessUser implements IUser {
    // 新增一个用户
    @Override
    public void insert(User user) {
        System.out.println("在Access中给User表添加一条记录");
    }

    // 获取一个用户信息
    @Override
    public User getUser(Integer id) {
        System.out.println("在Access中根据用户ID得到User表一条记录");
        return null;
    }
}
