package com.study.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* ����ʹ��
 * HashTable ��ϣ�������ʵ��
 * 		������ ��������nullֵ��null��
 * 			 �̰߳�ȫ  
 * 			 �÷���HashMap��ͬ
 * 
 * 
 * �ܽ�
 * ʵ����				�ײ�ʵ�� 		�ص�
 * HashMap  		����ʵ��  	  ����Hash����Ԫ���±�
 * LinkedHashMap  	����ʵ�� 	  ����ṹ��Ԫ�����˳��ʹ洢˳��һ��
 * TreeMap 			���ṹʵ��	  ��Ԫ�ص���Ȼ˳��������ض��ıȽ�����Comparable�ӿڣ�����
 * 	
 * 
 * Collections�����ࣺ������Arrays
 * */
public class Task04HashTable {
	public static void main(String[] args) {
		HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
		hm1.put("��1",18);
		hm1.put("��2",18);
		hm1.put("��3",18);
		hm1.put("��4",18);
		hm1.put("��5",18);
		hm1.put("��6",18);
		////////////////////
		System.out.println(hm1);
		System.out.println("---------------------");
		
		Set<Map.Entry<String,Integer>> s1 = hm1.entrySet();
		for(Map.Entry<String, Integer> keyAndvalue : s1) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		
		
		
	}

}
