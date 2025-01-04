package com.shanhai._2_StrategyPattern;

import java.util.Scanner;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/28 15:45
 */
public class Test01 {
    public static void main(String[] args) {
        int discount; // 商品销售模式 1.原价 2.八折 3.七折 4.满300减100
        double price = 0d; // 商品单价
        int num = 0; // 商品购买数量
        double totalPrice = 0d; // 当前商品合计费用
        double total = 0d; // 总计所有商品费用

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("请输入商品销售模式，1.原价 2.八折 3.七折 4.满300减100：");
            discount = Integer.parseInt(sc.nextLine());
            System.out.print("请输入商品单价：");
            price = Double.parseDouble(sc.nextLine());
            System.out.print("请输入商品数量：");
            num = Integer.parseInt(sc.nextLine());
            if (price > 0 && num > 0) {
                // 简单工厂模式根据discount的数字选择合适的收费类生成实例
                CashSuper cashAccept = CashFactory.createCashAccept(discount);
                // 通过多态，可以根据不同收费策略计算得到收费的结果
                totalPrice = cashAccept.acceptCash(price, num);

                total += totalPrice;
                System.out.println(String.format("单价：%s元 数量：%s 合计: %s元", price, num, totalPrice));
                System.out.println(String.format("总计：%s元", total));
                System.out.println();
            }
        } while (price > 0 && num > 0);
    }
}
