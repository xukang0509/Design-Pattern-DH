package com.shanhai._22_FlyWeight;

/**
 * @description: 具体网站类
 * @author: xu
 * @date: 2025/1/19 17:27
 */
public class ConcreteWebSite extends WebSite {
    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
