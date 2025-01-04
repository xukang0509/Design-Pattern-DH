package com.shanhai._6_PrototypePattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 工作经历
 * @author: xu
 * @date: 2025/1/1 14:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkExperience implements Cloneable {
    // 工作时间范围
    private String timeArea;
    // 所在公司
    private String company;

    @Override
    protected WorkExperience clone() {
        WorkExperience obj = null;
        try {
            obj = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}
