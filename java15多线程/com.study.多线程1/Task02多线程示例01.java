package com.study.���߳�1;

public class Task02���߳�ʾ��01 {
	public static void main(String[] args) {
		//�������߳�
		ChatThread chat = new ChatThread();
		EatThread eat = new EatThread();
		DrinkThread drink = new DrinkThread();
		//�����߳�
		chat.start();
		eat.start();
		drink.start();
	
	}
}
