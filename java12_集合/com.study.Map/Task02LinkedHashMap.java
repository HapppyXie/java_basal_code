package com.study.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 	LinkedHashMap 哈希表和链表实现
 * 		特征：	元素添加顺序和存储顺序相同
 * 		 		予许null值和null键
 * 		 		重复键会被覆盖，值可以重复
 * */
public class Task02LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap <String,String> lks1 = new LinkedHashMap<String,String>();
		lks1.put("课1", "O");
		lks1.put("课2", "Q");
		lks1.put("课3", "V");
		lks1.put("课4", "B");
		lks1.put("课5", "G");
		lks1.put("课6", "S");
		lks1.put("课7", "J");
		lks1.put("课8", "P");
		lks1.put("课1", "99");
		//遍历
		Set<String> s1 = lks1.keySet();
		for(String s : s1) {
			System.out.println(s+":"+lks1.get(s));
		}
		
		System.out.println("-------------------------");
		//EntrySet
		Set<Map.Entry<String, String>> s2 = lks1.entrySet();
		for(Map.Entry<String,String> keyAndvalue : s2) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
			
		}
	}

}
