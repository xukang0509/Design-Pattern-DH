package com.shanhai._0_JavaBase.base;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/8 16:46
 */
public abstract class Animal {
    protected String name;

    protected int shoutNum = 3;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this.name = "无名";
    }


    public String shout() {
        String res = "";
        for (int i = 0; i < shoutNum; i++) {
            res += getShoutSound() + "，";
        }
        return "我的名字叫" + name + "，" + res;
    }

    protected abstract String getShoutSound();

    public int getShoutNum() {
        return shoutNum;
    }

    public void setShoutNum(int shoutNum) {
        this.shoutNum = shoutNum <= 10 ? shoutNum : 10;
    }
}
