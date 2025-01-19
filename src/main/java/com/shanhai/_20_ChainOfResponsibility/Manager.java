package com.shanhai._20_ChainOfResponsibility;

/**
 * @description: 管理者抽象类
 * @author: xu
 * @date: 2025/1/19 16:21
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    // 设置上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    // 请求申请
    public abstract void requestApplications(Request request);
}
