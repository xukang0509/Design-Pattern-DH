package com.shanhai._10_ObserverPattern;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/1 17:33
 */
public class Client {
    public static void main(String[] args) {
        // 老板胡汉三
        Subject boss = new Boss("胡汉三");
        
        // 看股票的同事
        Observer employee1 = new StockObserver("胡歌", boss);
        Observer employee2 = new StockObserver("彭于晏", boss);
        // 看NBA的同事
        Observer employee3 = new NBAObserver("霍建华", boss);

        // 老板登记三个同事
        boss.attach(employee1);
        boss.attach(employee2);
        boss.attach(employee3);

        // 当发现老板回来时
        boss.setAction("我胡汉三回来了");
        // 通知同事
        boss.notifyEmployee();
    }
}
