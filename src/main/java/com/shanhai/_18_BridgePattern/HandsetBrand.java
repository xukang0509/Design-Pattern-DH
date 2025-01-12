package com.shanhai._18_BridgePattern;

/**
 * @description: 手机品牌抽象类
 * @author: xu
 * @date: 2025/1/12 17:46
 */
public abstract class HandsetBrand {
    protected HandsetSoft handsetSoft;

    // 设置手机软件
    public void setHandsetSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    // 运行
    public abstract void run();
}
