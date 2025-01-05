package com.shanhai._11_AbstractFactory.db.factory1;

import com.shanhai._11_AbstractFactory.db.database.IDepartment;
import com.shanhai._11_AbstractFactory.db.database.IUser;
import com.shanhai._11_AbstractFactory.db.database.access.AccessDepartment;
import com.shanhai._11_AbstractFactory.db.database.access.AccessUser;

/**
 * @description: Access 工厂
 * @author: xu
 * @date: 2025/1/5 16:50
 */
public class AccessFactory implements IFactory {

    @Override
    public IUser createIUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createIDepartment() {
        return new AccessDepartment();
    }
}
