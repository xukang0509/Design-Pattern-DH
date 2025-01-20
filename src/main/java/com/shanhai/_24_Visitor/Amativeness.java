package com.shanhai._24_Visitor;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/20 21:48
 */
public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s时，凡事不懂也要装懂。",
                man.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("%s %s时，遇事懂也装作不懂。",
                woman.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
