package com.lifuz.factory;

import java.util.Map;

/**
 * 发型工厂
 *
 * 作者：李富
 * 邮箱：lifuzz@163.com
 * 时间：2016/9/21 10:26
 */
public class HairFactory {

    private HairFactory() {
    }

    private static HairFactory ourInstance ;

    public static HairFactory getInstance() {

        if (ourInstance == null) {
            ourInstance = new HairFactory();
        }

        return ourInstance;
    }

    /**
     * 根据类的key生产对象
     * @param key
     * @return
     */
    public Hair getHairByClassKey(String key) {
        Hair hair = null;

        Map<String,String> map = PropertiesReader.getProperties();

        String value = map.get(key);

       hair = getHairByClassName(value);

        return hair;
    }

    /**
     * 根据key值获取想要的对象
     * @param key
     * @return
     */
    public Hair getHair(String key){

        Hair hair = null;

        if ("left".equals(key)) {
            hair = new LeftHair();
        } else if ("right".equals(key)) {
            hair = new RightHair();
        }

        return  hair;

    }

    /**
     * 根据类的名称 生产对象
     * @param className
     * @return
     */
    public Hair getHairByClassName(String className){

        Hair hair = null;

        try {
            hair = (Hair) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return  hair;

    }


}
