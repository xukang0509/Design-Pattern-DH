package com.shanhai._24_Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 对象结构
 * @author: xu
 * @date: 2025/1/20 21:51
 */
public class ObjectStructure {
    private static List<Person> elements = new ArrayList<>();

    //增加
    public static void accach(Person person) {
        elements.add(person);
    }

    // 移除
    public static void detach(Person person) {
        elements.remove(person);
    }

    // 查看显示
    public static void display(Action visitor) {
        elements.forEach(p -> p.accept(visitor));
    }
}
