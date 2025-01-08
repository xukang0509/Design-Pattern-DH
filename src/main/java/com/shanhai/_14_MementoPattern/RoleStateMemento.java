package com.shanhai._14_MementoPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: 角色状态存储箱
 * @author: xu
 * @date: 2025/1/8 21:04
 */
@Data
@AllArgsConstructor
public class RoleStateMemento {
    // 生命力
    private Integer vitality;
    // 攻击力
    private Integer attack;
    // 防御力
    private Integer defense;
}
