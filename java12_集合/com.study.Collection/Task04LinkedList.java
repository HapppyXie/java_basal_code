package com.study.Collection;

import java.util.Arrays;
import java.util.LinkedList;

/* ArrayList�ĵײ�ṹ������   �����Ĵ洢�ռ�
 * LinkedList�ĵײ�ʵ��������  �洢�ռ䲻������һ���洢�ռ�������֣�A��B
 * 							A�������ݣ�B������һ���洢�ռ�ĵ�ַ��ʹ������ʵ�ֲ���
 * ʵ��KTV���ϵͳ�� ���-���� �ö�-���ӵ���һλ �滻-�滻����
 * 
 * 
 * Vector Vector�Ĺ��ܺ�ArrayListһ��
 * 		  Vector�̰߳�ȫ,Ч�ʻ��
 * 
 * 		 ʵ����		(������)�ײ�ʵ��  	  �ص�
 * С�᣺ArrayList 	����ʵ��	  		��ѯ�죬��ɾ��
 *	   LinkedList   ����ʵ��	  		��ѯ�죬��ɾ��
 *	   Vector		����ʵ��	  		�̰߳�ȫ��Ч�ʱ�ArrayList��
 *
 *Stack����
 *		1.����ȳ�
 *		2.�̳�Vector ,�߳�ͬ�������̰߳�ȫ
 *		3.ʹ��push��pop,peek,serach����
 *
 * */
public class Task04LinkedList {
	public static void main(String[] args) {
		//��������б�
		LinkedList<String> lk1 = new LinkedList<String>();
		//�������
		lk1.add("����ˮ");
		lk1.add("����̫��");
		lk1.add("��̷��ħ");
		lk1.add("�Ǳ�");
		lk1.add("��������");
		System.out.println(lk1);
		System.out.println(Arrays.toString(lk1.toArray()));
		//�ö�
		lk1.add(0,"�ҵ��й���");
		lk1.addFirst("Waiting for you");
		System.out.println(lk1);
		//�滻
		lk1.set(4, "river follow you");
		System.out.println(lk1);
	}

}
