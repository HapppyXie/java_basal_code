package com.study.Collection;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet ��ϣ��������ʵ��
 * 		������1.���������ݵ�˳���Ӧ���ڵ��˳��(����)
 * 			2.����Ԫ��Ϊnull
 * 
 * */
public class Task06LinkedHashSet {
	public static void main(String[] args) {
		//����
		LinkedHashSet <String> lhs1 = new LinkedHashSet<String>();
		lhs1.add("��1");
		lhs1.add("��2");
		lhs1.add("��3");
		lhs1.add("��4");
		lhs1.add("��5");
		lhs1.add("��6");
		lhs1.add("��7");
		lhs1.add("��1");//�ظ���Ʒ
		System.out.println(lhs1.toString());
		
		
	}

}
