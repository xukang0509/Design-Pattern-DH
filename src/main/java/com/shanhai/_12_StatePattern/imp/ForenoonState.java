package com.shanhai._12_StatePattern.imp;

import com.shanhai._12_StatePattern.State;
import com.shanhai._12_StatePattern.Work;

/**
 * @description: 上午工作状态
 * @author: xu
 * @date: 2025/1/6 21:04
 */
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点，上午工作，精神百倍");
        } else {
            // 超过12点，就转入中午午休状态
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }
}
