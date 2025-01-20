package com.shanhai._24_Visitor;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/20 21:48
 */
public class Marriage extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s时，感慨道：恋爱游戏终结时，'有妻徒刑'遥无期。",
                man.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("%s %s时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安。",
                woman.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
