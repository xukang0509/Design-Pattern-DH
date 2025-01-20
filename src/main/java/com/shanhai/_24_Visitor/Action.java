package com.shanhai._24_Visitor;

/**
 * @description: 状态抽象类
 * @author: xu
 * @date: 2025/1/20 21:39
 */
public abstract class Action {
    // 得到男人的结论和反应
    public abstract void getManConclusion(Man man);

    // 得到女人的结论和反应
    public abstract void getWomanConclusion(Woman woman);
}
