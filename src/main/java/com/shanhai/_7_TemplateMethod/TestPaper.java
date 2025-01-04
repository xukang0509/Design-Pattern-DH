package com.shanhai._7_TemplateMethod;

/**
 * @description: 考题试卷
 * @author: xu
 * @date: 2025/1/1 14:59
 */
public abstract class TestPaper {
    // 试题1
    public void testQuestion1() {
        System.out.println("杨过得到，后来给了郭靖，练成倚天剑、屠龙刀的玄铁可能是[ ]");
        System.out.println("a.球磨铸铁");
        System.out.println("b.马口铁");
        System.out.println("c.高速合金钢");
        System.out.println("d.碳素纤维");
        System.out.println("答案：" + this.answer1());
        System.out.println();
    }

    // 试题2
    public void testQuestion2() {
        System.out.println("杨过、程英、陆无双铲除了情花，造成[ ]");
        System.out.println("a.使这种植物不再害人");
        System.out.println("b.使一种珍惜物种灭绝");
        System.out.println("c.破坏了那个生物圈的生态平衡");
        System.out.println("d.造成该地区沙漠化");
        System.out.println("答案：" + this.answer2());
        System.out.println();
    }

    // 试题3
    public void testQuestion3() {
        System.out.println("蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药[ ]");
        System.out.println("a.阿司匹林");
        System.out.println("b.牛黄解毒丸");
        System.out.println("c.氟哌酸");
        System.out.println("d.让他们喝大量的生牛奶");
        System.out.println("e.以上都不对");
        System.out.println("答案：" + this.answer3());
        System.out.println();
    }

    // 下面的抽象方法的目的就是给继承的子类重写，因为这里每个人的答案是不同的
    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();
}
