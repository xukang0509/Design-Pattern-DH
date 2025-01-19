package com.shanhai._20_ChainOfResponsibility;

/**
 * @description: 总经理
 * @author: xu
 * @date: 2025/1/19 16:23
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (Request.QJ.equals(request.getRequestType())) {
            System.out.println(String.format("%s:%s 数量:%s天，被批准", this.name, request.getRequestContent(), request.getNumber()));
        } else if (Request.JX.equals(request.getRequestType()) && request.getNumber() <= 5000) {
            System.out.println(String.format("%s:%s 数量:%s天，被批准", this.name, request.getRequestContent(), request.getNumber()));
        } else if (Request.JX.equals(request.getRequestType()) && request.getNumber() > 5000) {
            System.out.println(String.format("%s:%s 数量:%s天，再说吧", this.name, request.getRequestContent(), request.getNumber()));
        }
    }
}
