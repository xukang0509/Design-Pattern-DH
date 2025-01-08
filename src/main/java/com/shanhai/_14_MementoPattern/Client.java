package com.shanhai._14_MementoPattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/8 21:08
 */
public class Client {
    public static void main(String[] args) {
        // 大战Boss前
        GameRole role = new GameRole();
        role.getInitState();
        role.displayState();

        // 保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setRoleStateMemento(role.saveState());

        // 大战Boss时，损耗严重
        role.fight();
        // 显示状态
        role.displayState();

        // 游戏进度恢复
        role.restoreState(stateAdmin.getRoleStateMemento());
        // 显示状态
        role.displayState();
    }
}
