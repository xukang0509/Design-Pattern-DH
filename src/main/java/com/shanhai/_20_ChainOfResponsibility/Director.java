package com.shanhai._20_ChainOfResponsibility;

/**
 * @description: 总监
 * @author: xu
 * @date: 2025/1/19 16:23
 */
public class Director extends Manager {
    public Director(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (Request.QJ.equals(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println(String.format("%s:%s 数量:%s天，被批准", this.name, request.getRequestContent(), request.getNumber()));
        } else if (this.superior != null) {
            this.superior.requestApplications(request);
        }
    }
}
