package com.shanhai._5_factoryMethod.calculate.factory;

import com.shanhai._5_factoryMethod.calculate.IOperation;
import com.shanhai._5_factoryMethod.calculate.IOperationFactory;
import com.shanhai._5_factoryMethod.calculate.advancedOperation.Log;
import com.shanhai._5_factoryMethod.calculate.advancedOperation.Pow;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * @description: 高级运算工厂
 * @author: xu
 * @date: 2024/12/29 17:32
 */
public class FactoryAdvanced implements IOperationFactory {
    private static final Map<String, Supplier<IOperation>> MAP = new ConcurrentHashMap<>();

    {
        MAP.put("pow", Pow::new);
        MAP.put("log", Log::new);
        // 此处可扩展其他高级运算类的实例化、但修改当前工厂类不会影响到基础运算工厂类

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
