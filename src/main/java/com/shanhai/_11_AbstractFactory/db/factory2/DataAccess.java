package com.shanhai._11_AbstractFactory.db.factory2;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.database.IUser;
import com.shanhai._11_AbstractFactory.db.database.access.AccessDepartment;
import com.shanhai._11_AbstractFactory.db.database.access.AccessUser;
import com.shanhai._11_AbstractFactory.db.database.sqlserver.SqlserverDepartment;
import com.shanhai._11_AbstractFactory.db.database.sqlserver.SqlserverUser;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/5 17:22
 */
public class DataAccess {
    //  数据库名称，可替换成Access
    public static String db = "Sqlserver";

    // 创建用户对象工厂
    public static IUser createUser() {
        IUser user = null;
        switch (db) {
            case "Sqlserver":
                user = new SqlserverUser();
                break;
            case "Access":
                user = new AccessUser();
                break;
        }
        return user;
    }

    // 创建部门对象工厂
    public static IDepartment createDepartment() {
        IDepartment department = null;
        switch (db) {
            case "Sqlserver":
                department = new SqlserverDepartment();
                break;
            case "Access":
                department = new AccessDepartment();
                break;
        }
        return department;
    }
}
