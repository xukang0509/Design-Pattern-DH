package com.shanhai._6_PrototypePattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/1 14:34
 */
public class Test {
    public static void main(String[] args) {
        Resume resume1 = new Resume("大鸟");
        resume1.setPersonalInfo("男", "29");
        resume1.setWorkExperience("2012-2015", "xx公司");

        Resume resume2 = resume1.clone();
        resume2.setWorkExperience("2015-2018", "yy公司");

        Resume resume3 = resume1.clone();
        resume3.setWorkExperience("2018-2021", "zz公司");

        resume1.display();
        resume2.display();
        resume3.display();
    }
}
