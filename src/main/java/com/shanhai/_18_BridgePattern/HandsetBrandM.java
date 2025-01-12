package com.shanhai._18_BridgePattern;

/**
 * @description: 手机品牌M
 * @author: xu
 * @date: 2025/1/12 17:48
 */
public class HandsetBrandM extends HandsetBrand {
    @Override
    public void run() {
        System.out.print("品牌M");
        handsetSoft.run();
    }
}
