package com.shanhai._12_StatePattern;

import com.shanhai._12_StatePattern.imp.ForenoonState;
import lombok.Data;

/**
 * @description: 工作类
 * @author: xu
 * @date: 2025/1/6 20:56
 */
@Data
public class Work {
    // 当前状态
    private State current;

    // 当前的钟点:状态转换的依据
    private int hour;
    // 当前工作是否完成:是否能下班的依据
    private boolean workFinished = false;

    public Work() {
        current = new ForenoonState();
    }

    public void writeProgram() {
        this.current.writeProgram(this);
    }
}
