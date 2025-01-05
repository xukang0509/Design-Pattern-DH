package com.shanhai._11_AbstractFactory.db.factory1;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.database.IUser;
import com.shanhai._11_AbstractFactory.db.table.Department;
import com.shanhai._11_AbstractFactory.db.table.User;

/**
 * @description: 客户端
 * @author: xu
 * @date: 2025/1/5 16:43
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new SqlserverFactory();
        execute(factory);

        System.out.println("=".repeat(100));

        factory = new AccessFactory();
        execute(factory);
    }

    private static void execute(IFactory factory) {
        User user = new User();
        Department department = new Department();

        IUser iUser = factory.createIUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment iDepartment = factory.createIDepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(1);
    }
}
