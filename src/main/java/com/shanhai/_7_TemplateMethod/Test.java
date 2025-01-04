package com.shanhai._7_TemplateMethod;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/1 15:14
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("学生甲抄的试卷：");
        TestPaper studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("=".repeat(88));

        System.out.println("学生乙抄的试卷：");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
