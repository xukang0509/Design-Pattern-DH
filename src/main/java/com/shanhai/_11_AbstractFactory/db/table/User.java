package com.shanhai._11_AbstractFactory.db.table;

import lombok.Data;

/**
 * @description: 用户表
 * @author: xu
 * @date: 2025/1/5 16:30
 */
@Data
public class User {
    // 用户Id
    private Integer _id;
    // 用户名称
    private String _name;
}
