package com.shanhai._11_AbstractFactory.db.database;

import com.shanhai._11_AbstractFactory.db.table.User;

/**
 * @description: 用户类接口
 * @author: xu
 * @date: 2025/1/5 16:45
 */
public interface IUser {
    // 新增一个用户
    void insert(User user);

    // 获取一个用户信息
    User getUser(Integer id);
}
