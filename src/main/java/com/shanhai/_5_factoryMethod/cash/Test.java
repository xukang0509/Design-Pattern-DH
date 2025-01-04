package com.shanhai._5_factoryMethod.cash;

import java.util.Scanner;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/29 16:32
 */
public class Test {
    public static void main(String[] args) {
        int discount; // 商品销售模式 1.原价 2.八折 3.七折 4.满300减100
        double price = 0d; // 商品单价
        int num = 0; // 商品购买数量
        double totalPrice = 0d; // 当前商品合计费用
        double total = 0d; // 总计所有商品费用

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("请输入商品销售模式:");
            System.out.println("1.原价");
            System.out.println("2.八折");
            System.out.println("3.七折");
            System.out.println("4.满300减100");
            System.out.println("5.先打八折，再满300减100");
            System.out.println("6.先满200减50，再打七折");

            discount = Integer.parseInt(sc.nextLine());
            System.out.print("请输入商品单价：");
            price = Double.parseDouble(sc.nextLine());
            System.out.print("请输入商品数量：");
            num = Integer.parseInt(sc.nextLine());
            if (price > 0 && num > 0) {
                // 根据用户输入，将对应的策略对象作为参数传入CashContext对象中
                CashContext cashContext = new CashContext(discount);
                // 通过Context的acceptCash方法的调用，可以得到收取费用的结果
                // 让具体算法与客户进行了隔离
                totalPrice = cashContext.acceptCash(price, num);

                total += totalPrice;
                System.out.println(String.format("单价：%s元 数量：%s 合计: %s元", price, num, totalPrice));
                System.out.println(String.format("总计：%s元", total));
                System.out.println();
            }
        } while (price > 0 && num > 0);
    }
}
