package com.shanhai._20_ChainOfResponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 申请
 * @author: xu
 * @date: 2025/1/19 16:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    public static final String QJ = "请假";
    public static final String JX = "加薪";

    // 申请类别
    private String requestType;
    // 申请内容
    private String requestContent;
    // 数量
    private Integer number;
}
