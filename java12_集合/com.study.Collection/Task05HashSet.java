package com.study.Collection;

import java.util.HashSet;

//			<interface>Set����
	//		HashSet 		TreeSet
	//		LinkedHashSet
/*
 * HashSet ��ϣ��������ʵ��
 * ����:����֤Ԫ�ص�˳������Ԫ��Ϊnull��
 * 		Ԫ�ز������ظ���ʹ���Զ�����ʱҪ����дhashCode��equals������
 * �洢��Set�����е����ݹ涨Ҫ��дequals��hashCode����
 * */
public class Task05HashSet {
	public static void main(String[] args) {
		HashSet <String> hs1 = new HashSet<String>();
		//����1��
		hs1.add("��1");
		hs1.add("��2");
		hs1.add("��3");
		hs1.add("��4");
		hs1.add("��5");
		hs1.add("��6");
		hs1.add("��7");
		hs1.add("��1");//�ظ���Ʒ
		//��ӡ
		System.out.println(hs1.toString());
		System.out.println(hs1.size());
		System.out.println("-----------------------");
		
		//����2
		HashSet<Course> hs2 = new HashSet<Course>();
		// id name credit hours teacher
		hs2.add(new Course(1,"�γ�1",3,48,"��ʦ1"));
		hs2.add(new Course(2,"�γ�2",6,56,"��ʦ2"));
		hs2.add(new Course(3,"�γ�3",7,48,"��ʦ3"));
		hs2.add(new Course(4,"�γ�4",2,67,"��ʦ4"));
		hs2.add(new Course(5,"�γ�5",8,48,"��ʦ5"));
		hs2.add(new Course(6,"�γ�6",3,86,"��ʦ6"));
		hs2.add(new Course(7,"�γ�7",3,45,"��ʦ7"));
		hs2.add(new Course(7,"�γ�7",3,45,"��ʦ7"));//�����ظ���������д
		//foreach����
		for(Course c :hs2) {
			System.out.println(c.toString());
		}
		
	}

}
