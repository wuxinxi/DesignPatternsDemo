package com.wxx.design.design_01_single;

import java.util.HashMap;
import java.util.Map;

/**
 * @author TangRen
 * @create 2019-06-16 21:39
 * @TODO: 使用容器实现单例模式
 * 程序初始化的时候将所有单例类型都注入到这个管理类中，统一操作降低耦合
 */
public class SingletonManager {
    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonManager() {

    }

    public static void register(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return objectMap.get(key);
    }
}
