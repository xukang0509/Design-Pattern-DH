package com.shanhai._11_AbstractFactory.cash;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @description:
 * @author: xu
 * @date: 2024/12/28 16:11
 */
public class CashContext {

    private static String assemblyName = "com.shanhai._11_AbstractFactory.cash.factory.";

    private static final Properties dataMap = new Properties();

    static {
        try {
            String path = System.getProperty("user.dir") + "/src/main/java/com/shanhai/_11_AbstractFactory/cash/data.properties";
            System.out.println("path = " + path);
            BufferedReader br = new BufferedReader(new FileReader(path));
            dataMap.load(br);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // 声明一个 ISale 对象
    private ISale sale;

    // 通过构造方法，传入具体的收费策略
    public CashContext(int cashType) {
        String configStr = (String) dataMap.get("strategy" + cashType);
        String[] config = configStr.split(",");
        ISaleFactory saleFactory = getSaleFactoryInstance(config[0],
                Double.parseDouble(config[1]), Double.parseDouble(config[2]), Double.parseDouble(config[3]));
        this.sale = saleFactory.createSalesModel();
    }


    private ISaleFactory getSaleFactoryInstance(String className, Double a, Double b, Double c) {
        ISaleFactory saleFactory = null;
        try {
            saleFactory = (ISaleFactory) Class.forName(assemblyName + className)
                    .getDeclaredConstructor(new Class[]{Double.class, Double.class, Double.class})
                    .newInstance(new Object[]{a, b, c});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return saleFactory;
    }

    public Double acceptCash(Double price, int num) {
        return this.sale.acceptCash(price, num);
    }
}
