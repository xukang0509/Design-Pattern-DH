package com.shanhai._12_StatePattern.imp;

import com.shanhai._12_StatePattern.State;
import com.shanhai._12_StatePattern.Work;

/**
 * @description: 傍晚工作状态
 * @author: xu
 * @date: 2025/1/6 21:04
 */
public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.isWorkFinished()) {
            // 工作完成，就转入下班状态
            work.setCurrent(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 20) {
                System.out.println("当前时间：" + work.getHour() + "点，加班哦，疲惫之极");
            } else {
                // 超过20点，不能再加班了，强制下班
                work.setCurrent(new ForseRestState());
                work.writeProgram();
            }
        }
    }
}
