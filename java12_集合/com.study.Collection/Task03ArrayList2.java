package com.study.Collection;


import java.util.ArrayList;
import java.util.Iterator;



/**
 *  ArrayList������Ʒ��������ʹ��ArrayList����һ�����ﳵ�����ﳵ�������Ʒ����Ʒ����
 *  					��ͨ������ɾ���ͻ����Ʒ��Ϣ��Ȼ��������ﳵ����ӡ���ﳵ��������Ʒ��Ϣ
 * 
 *
 */
public class Task03ArrayList2 {
	public static void main(String[] args) {
		ArrayList <Product> l2 = new ArrayList<Product>();
		//Integer id, String name, Double price, String description
		Product p1 = new Product(1,"����",3.5,"��ˬ���");
		Product p2 = new Product(2,"��֭",5.0,"Ӫ����֭");
		Product p3 = new Product(3,"ţ��",5.0,"��ͱر�");
		Product p4 = new Product(4,"�����",6.0,"��ˬ���");
		l2.add(p1);
		l2.add(p2);
		l2.add(p3);
		l2.add(p4);
		l2.add(new Product(5,"����",4.0,"��ʽ���"));
		//����
		for(Product p : l2) {
			System.out.println(p);
		}
		System.out.println("----------------------------");
		//ɾ������Ϊ1����Ʒ��ı���
		l2.remove(1);
		for(Product p:l2) {
			System.out.println(p);
		}
		System.out.println("----------------------------");
		//�������Ϊ3����Ʒ
		System.out.println(l2.get(3));
		System.out.println("----------------------------");
		//���ֱ����ķ���
		System.out.println("---------��������------------");
		for(int i =0; i < l2.size(); i++) {
			System.out.println(l2.get(i));
		}
		System.out.println("----------foreach����------------");
		for(Product p : l2) {
			System.out.println(p);
		}
		System.out.println("------iterator���Ƽ�---------");
	Iterator<Product> iterator = l2.iterator();
	while(iterator.hasNext()) {
		Product food = iterator.next();
		System.out.println(food);
	}
	}

}
