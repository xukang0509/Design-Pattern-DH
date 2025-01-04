package com.shanhai._1_SimpleFactory;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/28 14:40
 */
public class Sub extends Operation{
    @Override
    public Double calculate(Double numberA, Double numberB) {
        return numberA - numberB;
    }
}
