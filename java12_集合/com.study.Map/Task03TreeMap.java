package com.study.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap	���ṹʵ��		�ȱȽϼ����ٱȽ�ֵ 0-9A-Z
 * 		��������ʵ��Ԫ�����򴢴棨��Ȼ����Ԫ���ض��ıȽ�����ʵ��Comparable�ӿڣ���
 * 			����nullֵ��null��
 * 			�ظ����ᱻ���ǣ�ֵ�����ظ�
 * 				
 * */
public class Task03TreeMap {
	public static void main(String[] args) {
		TreeMap <String,String> tm1 = new TreeMap<String,String>();
		tm1.put("��1", "O");
		tm1.put("��2", "p");
		tm1.put("��3", "y");
		tm1.put("��4", "g");
		tm1.put("��5", "r");
		//ֱ�Ӵ�ӡ
		System.out.println(tm1);
		
		//������ӡ
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
