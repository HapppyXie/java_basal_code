package com.study.singleton;

public class Boss2 {
	//����ʽ
	//1.˽�л���̬���ԣ�����������
	private static Boss2 boss;
	
	//2.���췽��˽�л�
	private Boss2() {
		System.out.println("ִ��Boss2���췽��");
	}
	private Boss2(String name) {
		
	}
	
	//3.�ṩ������̬�ӿ�
	public static Boss2 getInstance() {
		if(boss == null) {
			boss = new Boss2();  
		}
		return boss;
	}
}