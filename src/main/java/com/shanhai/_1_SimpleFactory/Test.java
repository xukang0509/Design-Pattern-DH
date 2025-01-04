package com.shanhai._1_SimpleFactory;

import java.util.Scanner;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/28 14:52
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("请输入数字A：");
                Double numberA = Double.parseDouble(sc.nextLine());
                System.out.print("请输入运算符号(+、-、*、/)：");
                String operator = sc.nextLine();
                System.out.print("请输入数字B：");
                Double numberB = Double.parseDouble(sc.nextLine());

                Operation operation = OperationFactory.createOperation(operator);
                Double result = operation.calculate(numberA, numberB);
                System.out.println(String.format("%s %s %s = %s", numberA, operator, numberB, result));
                System.out.println("=".repeat(80));
            } catch (Exception e) {
                System.out.println("您的输入有误：" + e);
            }
        }
    }
}
