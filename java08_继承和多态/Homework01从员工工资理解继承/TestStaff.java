package Homework1��Ա�����ʹ������̳�;

import java.net.MulticastSocket;

public class TestStaff {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.setName("����");
		m1.setSalary(15000);
		m1.setScore(80);
		m1.setMarketCost(20000);
		System.out.println(m1);
		m1.toWork();
		
		Employee e1 = new Employee();
		e1.setName("����");
		e1.setSalary(15000);
		e1.setScore(80);
		System.out.println(e1);
		e1.toWork("����", "����");
	}
/*
 * �̳�����������̳и���ķ�˽�г�Ա
 *        ���̳й��췽��
 *        ���������д����ķ���
 *        �������׷�����Ժͷ���
 * Ŀ�ģ���ߴ���ĸ�����
 *     ���¸���ķ�������չ�͸�����ͬ�ĳ�Ա      
 *        
 * 
 * 
 * 
 * */
}
