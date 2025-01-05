package com.shanhai._11_AbstractFactory.db.factory3;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.database.IUser;
import com.shanhai._11_AbstractFactory.db.table.Department;
import com.shanhai._11_AbstractFactory.db.table.User;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/5 17:41
 */
public class Client {
    public static void main(String[] args) {
        IUser user = DataAccess.createUser();
        user.insert(new User());
        user.getUser(1);

        IDepartment department = DataAccess.createDepartment();
        department.insert(new Department());
        department.getDepartment(1);
    }
}
