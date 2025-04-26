package com.shanhai._5_factoryMethod.calculate.factory;

import com.shanhai._5_factoryMethod.calculate.IOperation;
import com.shanhai._5_factoryMethod.calculate.IOperationFactory;
import com.shanhai._5_factoryMethod.calculate.baiscOperation.Add;
import com.shanhai._5_factoryMethod.calculate.baiscOperation.Div;
import com.shanhai._5_factoryMethod.calculate.baiscOperation.Mul;
import com.shanhai._5_factoryMethod.calculate.baiscOperation.Sub;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * @description: 基础运算工厂
 * @author: xu
 * @date: 2024/12/29 17:19
 */
public class FactoryBasic implements IOperationFactory {
    private static final Map<String, Supplier<IOperation>> MAP = new ConcurrentHashMap<>();

    {
        MAP.put("+", Add::new);
        MAP.put("-", Sub::new);
        MAP.put("*", Mul::new);
        MAP.put("/", Div::new);
    }

    @Override
    public IOperation createOperation(String operationType) {
        IOperation oper = null;
        Supplier<IOperation> supplier = MAP.get(operationType);
        if (supplier != null) {
            oper = supplier.get();
        }
        return oper;
    }
}
