package com.shanhai._18_BridgePattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/12 17:50
 */
public class Client {
    public static void main(String[] args) {
        HandsetBrand handsetBrand = new HandsetBrandN();

        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();

        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();

        handsetBrand = new HandsetBrandM();

        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();

        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();

        handsetBrand = new HandsetBrandS();

        handsetBrand.setHandsetSoft(new HandsetGame());
        handsetBrand.run();

        handsetBrand.setHandsetSoft(new HandsetAddressList());
        handsetBrand.run();

        handsetBrand.setHandsetSoft(new HandsetMusic());
        handsetBrand.run();
    }
}
