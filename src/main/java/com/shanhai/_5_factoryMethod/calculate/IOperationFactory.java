package com.shanhai._5_factoryMethod.calculate;

/**
 * @description: 运算工厂接口
 * @author: xu
 * @date: 2024/12/29 17:13
 */
public interface IOperationFactory {
    IOperation createOperation(String operationType);
}
