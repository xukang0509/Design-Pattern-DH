package com.shanhai._15_CompositePattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/8 21:44
 */
public class Client {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany shComp = new ConcreteCompany("上海华东分公司");
        shComp.add(new HRDepartment("华东分公司人力资源部"));
        shComp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(shComp);

        ConcreteCompany njComp = new ConcreteCompany("南京办事处");
        njComp.add(new HRDepartment("南京办事处人力资源部"));
        njComp.add(new FinanceDepartment("南京办事处财务部"));
        shComp.add(njComp);

        ConcreteCompany hzComp = new ConcreteCompany("杭州办事处");
        hzComp.add(new HRDepartment("杭州办事处人力资源部"));
        hzComp.add(new FinanceDepartment("杭州办事处财务部"));
        shComp.add(hzComp);

        System.out.println("结构图");
        root.display(1);
        System.out.println("职责：");
        root.lineOfDuty();
    }
}
