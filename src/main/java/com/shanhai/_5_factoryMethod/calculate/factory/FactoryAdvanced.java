package com.shanhai._5_factoryMethod.calculate.factory;

import com.shanhai._5_factoryMethod.calculate.IOperation;
import com.shanhai._5_factoryMethod.calculate.IOperationFactory;
import com.shanhai._5_factoryMethod.calculate.advancedOperation.Log;
import com.shanhai._5_factoryMethod.calculate.advancedOperation.Pow;

/**
 * @description: 高级运算工厂
 * @author: xu
 * @date: 2024/12/29 17:32
 */
public class FactoryAdvanced implements IOperationFactory {
    @Override
    public IOperation createOperation(String operationType) {
        IOperation oper = null;
        switch (operationType) {
            case "pow" -> oper = new Pow();
            case "log" -> oper = new Log();

            // 此处可扩展其他高级运算类的实例化、但修改当前工厂类不会影响到基础运算工厂类
        }
        return oper;
    }
}
