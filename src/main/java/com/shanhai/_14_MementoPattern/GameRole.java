package com.shanhai._14_MementoPattern;

import lombok.Data;

/**
 * @description: 游戏角色
 * @author: xu
 * @date: 2025/1/8 20:58
 */
@Data
public class GameRole {
    // 生命力
    private Integer vitality;
    // 攻击力
    private Integer attack;
    // 防御力
    private Integer defense;

    // 状态显示
    public void displayState() {
        System.out.println("角色当前状态");
        System.out.println("生命: " + vitality);
        System.out.println("攻击: " + attack);
        System.out.println("防御: " + defense);
        System.out.println();
    }

    // 获得初始状态(数据通常来自本机磁盘或远程数据接口)
    public void getInitState() {
        vitality = 100;
        attack = 100;
        defense = 100;
    }

    // 战斗后(在与Boss大战后游戏损耗为0)
    public void fight() {
        vitality = 0;
        attack = 0;
        defense = 0;
    }

    // 保存角色状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(vitality, attack, defense);
    }

    // 恢复角色状态
    public void restoreState(RoleStateMemento memento) {
        vitality = memento.getVitality();
        attack = memento.getAttack();
        defense = memento.getDefense();
    }

}
