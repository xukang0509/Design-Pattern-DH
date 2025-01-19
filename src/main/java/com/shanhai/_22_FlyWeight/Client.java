package com.shanhai._22_FlyWeight;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/19 17:32
 */
public class Client {
    public static void main(String[] args) {
        WebSite fx = WebsiteFactory.getWebSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = WebsiteFactory.getWebSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = WebsiteFactory.getWebSiteCategory("产品展示");
        fz.use(new User("娇娇"));

        WebSite fl = WebsiteFactory.getWebSiteCategory("博客");
        fl.use(new User("小菜"));

        WebSite fm = WebsiteFactory.getWebSiteCategory("博客");
        fm.use(new User("大鸟"));

        WebSite fn = WebsiteFactory.getWebSiteCategory("博客");
        fn.use(new User("娇娇"));

        System.out.println("网站分类总数为：" + WebsiteFactory.getWebSiteCount());
    }
}
