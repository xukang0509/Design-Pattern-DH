package com.shanhai._12_StatePattern.imp;

import com.shanhai._12_StatePattern.State;
import com.shanhai._12_StatePattern.Work;

/**
 * @description: 下午工作状态
 * @author: xu
 * @date: 2025/1/6 21:04
 */
public class AfternoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点，下午状态还不错，继续努力");
        } else {
            // 超过17点，就转入傍晚间工作状态
            work.setCurrent(new EveningState());
            work.writeProgram();
        }
    }
}
