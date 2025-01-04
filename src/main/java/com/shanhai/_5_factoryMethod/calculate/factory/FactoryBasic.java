package com.shanhai._5_factoryMethod.calculate.factory;

import com.shanhai._5_factoryMethod.calculate.IOperation;
import com.shanhai._5_factoryMethod.calculate.IOperationFactory;
import com.shanhai._5_factoryMethod.calculate.baiscOperation.Add;
import com.shanhai._5_factoryMethod.calculate.baiscOperation.Div;
import com.shanhai._5_factoryMethod.calculate.baiscOperation.Mul;
import com.shanhai._5_factoryMethod.calculate.baiscOperation.Sub;

/**
 * @description: 基础运算工厂
 * @author: xu
 * @date: 2024/12/29 17:19
 */
public class FactoryBasic implements IOperationFactory {
    @Override
    public IOperation createOperation(String operationType) {
        IOperation oper = null;
        switch (operationType) {
            case "+" -> oper = new Add();
            case "-" -> oper = new Sub();
            case "*" -> oper = new Mul();
            case "/" -> oper = new Div();
        }
        return oper;
    }
}
