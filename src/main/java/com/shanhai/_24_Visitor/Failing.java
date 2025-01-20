package com.shanhai._24_Visitor;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/20 21:43
 */
public class Failing extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println(String.format("%s %s时，闷头喝酒，谁也不用劝。",
                man.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(String.format("%s %s时，眼泪汪汪，谁也劝不了。",
                woman.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
