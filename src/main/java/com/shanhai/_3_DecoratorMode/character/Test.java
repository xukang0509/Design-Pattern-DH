package com.shanhai._3_DecoratorMode.character;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/29 15:43
 */
public class Test {
    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("第一种装扮");
        Sneakers sneakers = new Sneakers(); // 球鞋
        BigTrouser bigTrouser = new BigTrouser(); // 垮裤
        TShirts tShirts = new TShirts(); // T恤
        sneakers.decorate(xc);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();
        System.out.println();

        System.out.println("第二种装扮");
        LeatherShoes leatherShoes = new LeatherShoes(); // 皮鞋
        Tie tie = new Tie(); // 领带
        Suit suit = new Suit(); // 西装
        suit.decorate(tie);
        tie.decorate(leatherShoes);
        leatherShoes.decorate(xc);
        suit.show();
        System.out.println();

        System.out.println("第三种装扮");
        Strawhat strawhat = new Strawhat(); // 草帽
        strawhat.decorate(tie);
        tie.decorate(bigTrouser);
        bigTrouser.decorate(leatherShoes);
        leatherShoes.decorate(sneakers);
        sneakers.decorate(xc);
        strawhat.show();
    }
}
