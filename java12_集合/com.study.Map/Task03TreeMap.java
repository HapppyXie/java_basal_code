package com.study.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap	树结构实现		先比较键，再比较值 0-9A-Z
 * 		特征：可实现元素排序储存（自然排序，元素特定的比较器（实现Comparable接口））
 * 			予许null值和null键
 * 			重复键会被覆盖，值可以重复
 * 				
 * */
public class Task03TreeMap {
	public static void main(String[] args) {
		TreeMap <String,String> tm1 = new TreeMap<String,String>();
		tm1.put("课1", "O");
		tm1.put("课2", "p");
		tm1.put("课3", "y");
		tm1.put("课4", "g");
		tm1.put("课5", "r");
		//直接打印
		System.out.println(tm1);
		
		//遍历打印
		Set<Map.Entry<String,String>> s1 = tm1.entrySet();
		for(Map.Entry<String,String> keyAndvalue : s1) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		System.out.println("---------------------");
		Set<String> s2 = tm1.keySet();
		for(String s : s2) {
			System.out.println(s+":"+tm1.get(s));
		}
	}
}
