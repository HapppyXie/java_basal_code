package com.study.Collection;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		//��Ʒ����  
	//�������� <�ɷ�����> ������ = new ��������<�ɷ�����>();
 		ArrayList <Product> list = new ArrayList<Product>();
		
		//����
		list.add(new Product(1,"Ƥ��������",6.0,"Ӫ���ḻ"));
		list.add(new Product(2,"��÷������",12.0,"��������"));
		list.add(new Product(3,"���ݳ���",10.0,"�ó�ʵ��"));
		list.add(new Product(4,"�����ʳ�",6.0,"Ӫ�����"));

		System.out.println(list.toString());
		System.out.println("----------------------------");
		list.remove(1); //������0��ʼ,ɾ���󳤶�Ϊ3
		list.remove(2);   //2ɾ���˵�����
		System.out.println(list.toString());
	}

}
