package com.study.Collection;

import java.util.Arrays;
import java.util.TreeSet;

/*
 * TreeSet ���ṹʵ��			0-9A-Z
 * 		������1.��ʵ��Ԫ������洢(��Ȼ����Ԫ���ض��ıȽ�����ʵ��Comparable�ӿڣ�)
 * 			2.������Ԫ��Ϊnull
 * 
 * 
 * �ܽ�
 * 		ʵ����			�ײ�ʵ��		�ص�
 * 		HashSet  		����ʵ��		���ݹ�ϣֵ����Ԫ���±�
 * LinkedHashSet 		����ʵ��		����ṹ��Ԫ�����˳��ʹ洢˳��һ��
 * 		TreeSet			���ṹ��ʾ	 	��Ԫ�ص���Ȼ˳��������ض��ıȽ�����ʵ��Comparable�ӿڣ�����
 * 
 * */
public class Task07TreeSet {
	public static void main(String[] args) {
		TreeSet <String> lhs1 = new TreeSet <String>();
		lhs1.add("��1");
		lhs1.add("��2");
		lhs1.add("��3");
		lhs1.add("��4");
		lhs1.add("��5");
		lhs1.add("��6");
		lhs1.add("��7");
		lhs1.add("��1");//�ظ���Ʒ
		System.out.println(lhs1.toString());
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(1);
		ts1.add(89);
		ts1.add(4521);
		ts1.add(12);
		ts1.add(8);
		ts1.add(3);
		ts1.add(8);
		ts1.add(4);
		System.out.println(Arrays.toString(ts1.toArray()));
		//�����ִ�С����˳��
	}
}
