package com.study.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//*     					   		<interface>Collection
//// �ӽӿ�	 			<interface>List����  				<interface>Set����
////ʵ����	ArrayList 	LinkedList		Vector			HashSet 		TreeSet
//* 										stack			LinkedHashSet

public class Task02ArrayList1 {
/*
 * ArrayList ������List�ӿڣ���С�ɱ������ʵ�֣�
 * 					ʵ�������п�ѡ�б�Ĳ��������������null���ڵ�����Ԫ��
 * ������1.�ײ�ʵ�������飬���Ը���������ȡֵ��get(int index)
 * 		2.����nullֵ
 * */
	/*
	 * ����1-ArrayList�����ַ��� ����ʹ��ArrayList����һ�����ﳵ�����ﳵ�������Ʒ���ƣ��ַ�����
	 * 		��ͨ������ɾ���ͻ����Ʒ���ƣ�Ȼ��������ﳵ����ӡ���ﳵ�����е���Ʒ����
	 * */
	public static void main(String[] args) {
		//ԭ����ʽ�������ϣ�Ĭ�ϴ洢(raw type)Objectԭ������,���������ͻ���д���廯����
		ArrayList l2 = new ArrayList();
		l2.add("�ҵĲ���");
		String s1 = (String) l2.get(0);
		//l2.add(123);���ٿɷ�
		//�˴�ʹ��ǿ������ת��
		l2.add(123);
		int s2 = (int) l2.get(1);
		l2.add('a');
		char s3 =  (char) l2.get(2);
		l2.add(4456.212);
		double f1 = (double) l2.get(3);
		
		ArrayList<String> l1 = new ArrayList<String>();	
		//������Ʒ
		l1.add("����");
		l1.add("����");
		l1.add("���ı���");
		l1.add("����");
		l1.add("���");
		//�����Ʒ
		String food1 = l1.get(0);
		System.out.println(food1);
		System.out.println(l1.toString());
		//toArray()ת�����飬��������Arrays��toString()��ӡ
		System.out.println(Arrays.toString(l1.toArray()));
		//jdk1.5�������˷��ʹ���-�涨���ϴ洢ָ�����ͣ��������򼯺�����<����/����������>
		l1.remove(2);
		System.out.println(Arrays.toString(l1.toArray()));
		//�������ﳵ,�ѹ��ﳵ������Ʒ����ӡ 
		//1.for
		for(int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i)+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		//2.ͨ��������,����Iterator�������ɿɵ�������
		Iterator<String> iterator = l1.iterator();
		while(iterator.hasNext()) {
			String food = iterator.next();
			System.out.print(food+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		//3.forEach�﷨-��ǿ��forѭ��
		for(String food : l1) {
			System.out.print(food+" ");
		}
		
		
	}
}
