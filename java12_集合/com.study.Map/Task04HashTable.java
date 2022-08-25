package com.study.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 较少使用
 * HashTable 哈希表和数组实现
 * 		特征： 不予许有null值和null键
 * 			 线程安全  
 * 			 用法和HashMap相同
 * 
 * 
 * 总结
 * 实现类				底层实现 		特点
 * HashMap  		数组实现  	  根据Hash计算元素下标
 * LinkedHashMap  	链表实现 	  链表结构，元素添加顺序和存储顺序一致
 * TreeMap 			树结构实现	  按元素的自然顺序排序或特定的比较器（Comparable接口）排序
 * 	
 * 
 * Collections工具类：类似于Arrays
 * */
public class Task04HashTable {
	public static void main(String[] args) {
		HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
		hm1.put("菜1",18);
		hm1.put("菜2",18);
		hm1.put("菜3",18);
		hm1.put("菜4",18);
		hm1.put("菜5",18);
		hm1.put("菜6",18);
		////////////////////
		System.out.println(hm1);
		System.out.println("---------------------");
		
		Set<Map.Entry<String,Integer>> s1 = hm1.entrySet();
		for(Map.Entry<String, Integer> keyAndvalue : s1) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		
		
		
	}

}
