package com.shanhai._0_JavaBase;

import com.shanhai._0_JavaBase.action.IChange;
import com.shanhai._0_JavaBase.base.Animal;
import com.shanhai._0_JavaBase.son.*;
import com.shanhai._0_JavaBase.specialSon.MachineCat;
import com.shanhai._0_JavaBase.specialSon.StoneMonkey;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/8 16:17
 */
public class Test {
    public static void main(String[] args) {
        test1();
        System.out.println("=".repeat(30));
        test2();
        System.out.println("=".repeat(30));
        test3();
    }

    private static void test3() {
        IChange[] arr = new IChange[2];
        arr[0] = new MachineCat("叮当");
        arr[1] = new StoneMonkey("孙悟空");

        System.out.println(arr[0].changeThing("各种各样的东西！"));
        System.out.println(arr[1].changeThing("各种各样的东西！"));
    }

    private static void test2() {
        List<Animal> animalList = new ArrayList<>();

        // 报名代码
        animalList.add(new Sheep("小花"));
        animalList.add(new Dog("阿毛"));
        animalList.add(new Cattle("小黑"));
        animalList.add(new Cat("咪咪"));
        animalList.add(new Monkey("咪咪"));
        animalList.add(new MachineCat("叮当"));
        animalList.add(new StoneMonkey("孙悟空"));

        // 开始叫声比赛，遍历这个集合，让每个动物对象都shout
        for (Animal animal : animalList) {
            System.out.println(animal.shout());
        }
    }

    private static void test1() {
        Cat cat = new Cat("咪咪");
        cat.setShoutNum(5);
        System.out.println(cat.shout());
    }
}
