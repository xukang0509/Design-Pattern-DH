package com.shanhai._7_TemplateMethod;

/**
 * @description: 学生甲答的试卷
 * @author: xu
 * @date: 2025/1/1 15:13
 */
public class TestPaperA extends TestPaper {
    @Override
    public String answer1() {
        return "b";
    }

    @Override
    public String answer2() {
        return "a";
    }

    @Override
    public String answer3() {
        return "c";
    }
}
