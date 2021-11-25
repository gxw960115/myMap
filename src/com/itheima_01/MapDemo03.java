package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo03 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();

        //	添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

//        V get(Object key)	根据键获取值
        System.out.println(map.get("杨过"));
//        Set<K> keySet()	获取所有键的集合
        System.out.println(map.keySet());
//        Collection<V> values()	获取所有值的集合
        System.out.println(map.values());
//        Set<Map,Entry<K,V>> entrySet()	获取所有键值对对象的集合
        System.out.println(map.entrySet());
    }
}
