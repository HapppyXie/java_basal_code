package com.study.singleton;

public class Boss {
	/*
	 * ����ʽ
	 * */
//1.����˽�о�̬����Boss,��̬���Դ���һ��Bossʵ��
	private static Boss boss = new Boss();
	
	
//2.���췽��˽�л�
	private Boss() {
		System.out.println("ִ��Boss���췽��");
	}
	private Boss(String name) {
		
	}
//3.�ṩ��̬�������ʽӿ�
	public static Boss getInstance(){
		return boss;
	}
}
