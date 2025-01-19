package com.shanhai._20_ChainOfResponsibility;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/19 16:31
 */
public class Client {
    public static void main(String[] args) {
        CommonManager manager = new CommonManager("金利");
        Director director = new Director("宗剑");
        GeneralManager generalManager = new GeneralManager("钟精励");
        manager.setSuperior(director);
        director.setSuperior(generalManager);

        Request request = new Request(Request.QJ, "小菜请假", 1);
        manager.requestApplications(request);

        request = new Request(Request.QJ, "小菜请假", 4);
        manager.requestApplications(request);

        request = new Request(Request.QJ, "小菜请假", 8);
        manager.requestApplications(request);

        request = new Request(Request.JX, "小菜请求加薪", 4000);
        manager.requestApplications(request);

        request = new Request(Request.JX, "小菜请求加薪", 8000);
        manager.requestApplications(request);
    }
}
