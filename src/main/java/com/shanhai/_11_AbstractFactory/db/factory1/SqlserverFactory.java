package com.shanhai._11_AbstractFactory.db.factory1;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.database.IUser;
import com.shanhai._11_AbstractFactory.db.database.sqlserver.SqlserverDepartment;
import com.shanhai._11_AbstractFactory.db.database.sqlserver.SqlserverUser;

/**
 * @description: Sqlserver 工厂
 * @author: xu
 * @date: 2025/1/5 16:50
 */
public class SqlserverFactory implements IFactory {

    @Override
    public IUser createIUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createIDepartment() {
        return new SqlserverDepartment();
    }
}
