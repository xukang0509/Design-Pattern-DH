package com.shanhai._11_AbstractFactory.db.factory1;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.database.IUser;

/**
 * @description: 定义一个创建访问User表对象的抽象的工厂接口
 * @author: xu
 * @date: 2025/1/5 16:48
 */
public interface IFactory {
    IUser createIUser();

    IDepartment createIDepartment();
}
