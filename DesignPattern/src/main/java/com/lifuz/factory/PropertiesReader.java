package com.lifuz.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *
 * properties 文件读取类
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 11:04
 */
public class PropertiesReader {

    public static Map<String,String> getProperties() {
        Properties properties = new Properties();
        Map<String,String> map = new HashMap<>();

        ClassLoader classLoader = PropertiesReader.class.getClassLoader();

        InputStream in = classLoader.getResourceAsStream("type.properties");
        try {
            properties.load(in);
            Enumeration en = properties.propertyNames();

            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = properties.getProperty(key);
                map.put(key,property);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;

    }

}
