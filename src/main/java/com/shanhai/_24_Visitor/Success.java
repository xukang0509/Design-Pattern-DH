package com.shanhai._24_Visitor;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/20 21:43
 */
public class Success extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s时，背后多半有一个伟大的女人。",
                man.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("%s %s时，背后大多有一个不成功的男人。",
                woman.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
