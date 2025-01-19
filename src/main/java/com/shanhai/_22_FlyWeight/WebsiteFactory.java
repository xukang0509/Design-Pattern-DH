package com.shanhai._22_FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 网站工厂类
 * @author: xu
 * @date: 2025/1/19 17:29
 */
public class WebsiteFactory {
    private static final Map<String, WebSite> WEB_SITE_MAP = new HashMap<>();

    // 获取网站分类
    public static WebSite getWebSiteCategory(String key) {
        if (!WEB_SITE_MAP.containsKey(key)) {
            WEB_SITE_MAP.put(key, new ConcreteWebSite(key));
        }
        return WEB_SITE_MAP.get(key);
    }

    // 获得网站分类总数
    public static int getWebSiteCount() {
        return WEB_SITE_MAP.size();
    }
}
