package com.study.Map;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 	LinkedHashMap ��ϣ�������ʵ��
 * 		������	Ԫ�����˳��ʹ洢˳����ͬ
 * 		 		����nullֵ��null��
 * 		 		�ظ����ᱻ���ǣ�ֵ�����ظ�
 * */
public class Task02LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap <String,String> lks1 = new LinkedHashMap<String,String>();
		lks1.put("��1", "O");
		lks1.put("��2", "Q");
		lks1.put("��3", "V");
		lks1.put("��4", "B");
		lks1.put("��5", "G");
		lks1.put("��6", "S");
		lks1.put("��7", "J");
		lks1.put("��8", "P");
		lks1.put("��1", "99");
		//����
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
