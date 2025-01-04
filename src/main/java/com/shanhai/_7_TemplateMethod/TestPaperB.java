package com.shanhai._7_TemplateMethod;

/**
 * @description: 学生乙答的试卷
 * @author: xu
 * @date: 2025/1/1 15:13
 */
public class TestPaperB extends TestPaper {
    @Override
    public String answer1() {
        return "d";
    }

    @Override
    public String answer2() {
        return "b";
    }

    @Override
    public String answer3() {
        return "a";
    }
}
