package com.shanhai._11_AbstractFactory.db.factory2;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.database.IUser;
import com.shanhai._11_AbstractFactory.db.table.Department;
import com.shanhai._11_AbstractFactory.db.table.User;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/5 17:26
 */
public class Client {
    public static void main(String[] args) {
        execute();

        System.out.println("=".repeat(100));
        DataAccess.db = "Access";

        execute();
    }

    private static void execute() {
        User user = new User();
        Department department = new Department();

        IUser iUser = DataAccess.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(1);
    }
}
