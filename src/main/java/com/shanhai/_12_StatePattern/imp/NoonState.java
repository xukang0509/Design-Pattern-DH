package com.shanhai._12_StatePattern.imp;

import com.shanhai._12_StatePattern.State;
import com.shanhai._12_StatePattern.Work;

/**
 * @description: 中午工作状态
 * @author: xu
 * @date: 2025/1/6 21:04
 */
public class NoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间：" + work.getHour() + "点，饿了，午饭；犯困，午休。");
        } else {
            // 超过13点，就转入下午工作状态
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }
}
