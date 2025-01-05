package com.shanhai._11_AbstractFactory.db.factory3;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.database.IUser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/5 17:34
 */
public class DataAccess {
    private static String assemblyName = "com.shanhai._11_AbstractFactory.db.database.";

    // 创建用户对象工厂
    public static IUser createUser() {
        return (IUser) getInstance(assemblyName + getDb() + "User");
    }

    // 创建部门对象工厂
    public static IDepartment createDepartment() {
        return (IDepartment) getInstance(assemblyName + getDb() + "Department");
    }

    private static String getDb() {
        String result = "";
        try {
            Properties prop = new Properties();
            String path = System.getProperty("user.dir") + "/src/main/java/com/shanhai/_11_AbstractFactory/db/factory3/db.properties";
            System.out.println("path = " + path);
            BufferedReader br = new BufferedReader(new FileReader(path));
            prop.load(br);
            result = prop.getProperty("db");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private static Object getInstance(String className) {
        Object obj = null;
        try {
            obj = Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}
