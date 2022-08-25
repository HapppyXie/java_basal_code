package com.study.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 			Map�ӿڼ̳й�ϵ						ӳ��ӿ�,���ֵ��
	 * 	  									<interface>Map
	 * 		ʵ����			 	HashMap			HashTable			TreeMap��������
	 * 				 LinkedHashMap
 * */
public class Task01HashMap {
	/*
	 * HashMap	��ϣ�������ʵ��
	 * 		����������֤˳������nullֵ��null����
	 * 			�ظ����ᱻ���ǣ����ᱻ�ظ��� (ͨ��ʹ��StringΪ��)
	 * 			���̰߳�ȫ
	 * 
	 * */
	public static void main(String[] args) {
		HashMap <String,String> hm1 = new HashMap<String,String>();
		hm1.put("��ѧ", "L");
		hm1.put("Ӣ��", "Y");
		hm1.put("����","O");
		hm1.put("����", "M");
		
		//lambda���ʽ
		hm1.forEach((key,value)->{
			System.out.println(key+":"+value);
		});
		
		System.out.println("--------------------");
		//��ȡ������
		Set<String> keySet = hm1.keySet();
		//���ݼ���ȡֵ
		for(String key : keySet) {
			System.out.println(key+":"+hm1.get(key));
		}
		
		System.out.println("--------------------");
		
		//ͨ��EntrySet����
		Set<Map.Entry<String, String>> s1 = hm1.entrySet();
		//ȡ�����Ǽ�ֵ�ԣ�һ������->Map.Entry<String,String>
		for(Map.Entry<String, String> keyAndvalue : s1) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		
		System.out.println("-------------------");
		
		//(ͨ��ʹ��StringΪ��)		
		HashMap <String,Course> hm2 = new HashMap<String,Course>();
		hm2.put("�ҵĿ�1", new Course(1,"��ѧ1",4,64,"��ʦ1"));
		hm2.put("�ҵĿ�2", new Course(2,"��ѧ2",4,64,"��ʦ2"));
		hm2.put("�ҵĿ�3", new Course(3,"��ѧ3",4,64,"��ʦ3"));
		hm2.put("�ҵĿ�4", new Course(4,"��ѧ4",4,64,"��ʦ4"));
		hm2.put("�ҵĿ�5", new Course(5,"��ѧ5",4,64,"��ʦ5"));
		Set<Map.Entry<String, Course>> s2 = hm2.entrySet();
		for(Map.Entry<String,Course> keyAndvalue : s2) {
			System.out.println(keyAndvalue.getKey()+":"+keyAndvalue.getValue());
		}
		
		
	}	
}
