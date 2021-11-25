package com.itheima_01;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合概述
 * 	Interface Map<K,V>		K：键的类型，V：值的类型
 * 	将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
 * 	举例：学生的学号和姓名
 * 01	林青霞
 * 02	张曼玉
 * 03	王祖贤
 * 创建Map集合的对象
 * 多态的方式
 * 具体的实现类HashMap
 */
public class MapDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String,String> map = new HashMap<>();
//        map.put("1","林青霞");
//        map.put("1","张曼玉");
        map.put("1","王祖贤");
        map.put("2","张曼玉");
        map.put("3","王祖贤");
        map.put("3","柳岩");

        System.out.println(map);

    }
}
