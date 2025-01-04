package com.shanhai._4_Proxy;

/**
 * @description: 代理类
 * @author: xu
 * @date: 2024/12/29 16:54
 */
public class Proxy implements IGiveGift {
    // 代理人认识追求者
    private Pursuit pursuit;

    // 代理人也认识被追求者
    public Proxy(SchoolGirl mm) {
        // 代理初始化的过程，实际是追求者初始化的过程
        this.pursuit = new Pursuit(mm);
    }

    // 代理人 在送礼物，实际是追求者在送礼物
    @Override
    public void giveDolls() {
        this.pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        this.pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        this.pursuit.giveChocolate();
    }
}
