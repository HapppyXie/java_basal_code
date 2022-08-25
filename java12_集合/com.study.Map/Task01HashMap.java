package com.study.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 			Map接口继承关系						映射接口,存键值对
	 * 	  									<interface>Map
	 * 		实现类			 	HashMap			HashTable			TreeMap可以有序
	 * 				 LinkedHashMap
 * */
public class Task01HashMap {
	/*
	 * HashMap	哈希表和数组实现
	 * 		特征：不保证顺序；予许null值和null键；
	 * 			重复键会被覆盖，但会被重复； (通常使用String为键)
	 * 			非线程安全
	 * 
	 * */
	public static void main(String[] args) {
		HashMap <String,String> hm1 = new HashMap<String,String>();
		hm1.put("数学", "L");
		hm1.put("英语", "Y");
		hm1.put("语文","O");
		hm1.put("语文", "M");
		
		//lambda表达式
		hm1.forEach((key,value)->{
			System.out.println(key+":"+value);
		});
		
		System.out.println("--------------------");
		//获取键集合
		Set<String> keySet = hm1.keySet();
		//根据键获取值
		for(String key : keySet) {
			System.out.println(key+":"+hm1.get(key));
		}
		
		System.out.println("--------------------");
		
		//通过EntrySet遍历
		Set<Map.Entry<String, String>> s1 = hm1.entrySet();
		//取出的是键值对：一种类型->Map.Entry<String,String>
		for(Map.Entry<String, String> keyAndvalue : s1) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		
		System.out.println("-------------------");
		
		//(通常使用String为键)		
		HashMap <String,Course> hm2 = new HashMap<String,Course>();
		hm2.put("我的课1", new Course(1,"数学1",4,64,"老师1"));
		hm2.put("我的课2", new Course(2,"数学2",4,64,"老师2"));
		hm2.put("我的课3", new Course(3,"数学3",4,64,"老师3"));
		hm2.put("我的课4", new Course(4,"数学4",4,64,"老师4"));
		hm2.put("我的课5", new Course(5,"数学5",4,64,"老师5"));
		Set<Map.Entry<String, Course>> s2 = hm2.entrySet();
		for(Map.Entry<String,Course> keyAndvalue : s2) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		
		
	}	
}
