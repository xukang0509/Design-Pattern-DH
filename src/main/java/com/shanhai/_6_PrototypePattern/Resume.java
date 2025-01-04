package com.shanhai._6_PrototypePattern;

import lombok.Data;

/**
 * @description: 简历
 * @author: xu
 * @date: 2025/1/1 14:22
 */
@Data
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String timeArea, String company) {
        this.workExperience.setTimeArea(timeArea);
        this.workExperience.setCompany(company);
    }

    // 展示简历
    public void display() {
        System.out.println(String.format("%s %s %s", this.name, this.sex, this.age));
        System.out.println(String.format("工作经历 %s %s", this.workExperience.getTimeArea(), this.workExperience.getCompany()));
    }

    @Override
    protected Resume clone() {
        Resume object = null;
        try {
            object = (Resume) super.clone();
            // 对克隆对象里的引用也进行克隆，即达到了深拷贝的目的
            object.workExperience = this.workExperience.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return object;
    }
}
