package com.shanhai._9_BuilderPattern;

/**
 * @description: 指挥者
 * @author: xu
 * @date: 2025/1/1 17:08
 */
public class PersonDirector {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void buildPerson() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
