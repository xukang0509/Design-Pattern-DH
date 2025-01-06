package com.shanhai._12_StatePattern.imp;

import com.shanhai._12_StatePattern.State;
import com.shanhai._12_StatePattern.Work;

/**
 * @description: 下班休息状态
 * @author: xu
 * @date: 2025/1/6 21:04
 */
public class RestState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点，下班回家休息了");
    }
}
