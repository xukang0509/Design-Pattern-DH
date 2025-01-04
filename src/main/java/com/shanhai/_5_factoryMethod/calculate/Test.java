package com.shanhai._5_factoryMethod.calculate;

import java.util.Scanner;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/29 17:53
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("请输入数字A：");
                Double numberA = Double.parseDouble(sc.nextLine());
                System.out.print("请输入运算符号(+、-、*、/、pow、log)：");
                String operator = sc.nextLine();
                System.out.print("请输入数字B：");
                Double numberB = Double.parseDouble(sc.nextLine());

                IOperation operation = OperationFactory.createOperation(operator);
                Double result = operation.calculate(numberA, numberB);

                switch (operator) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        System.out.println(String.format("%s %s %s = %s", numberA, operator, numberB, result));
                        break;
                    case "pow":
                        System.out.println(String.format("%s^%s = %s", numberA, numberB, result));
                        break;
                    case "log":
                        System.out.println(String.format("log%s(%s) = %s", numberA, numberB, result));
                        break;
                }


                System.out.println("=".repeat(80));
            } catch (Exception e) {
                System.out.println("您的输入有误：" + e);
            }
        }
    }
}
