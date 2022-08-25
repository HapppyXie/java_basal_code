package com.study.多线程1;

public class Task02多线程示例01 {
	public static void main(String[] args) {
		//创建多线程
		ChatThread chat = new ChatThread();
		EatThread eat = new EatThread();
		DrinkThread drink = new DrinkThread();
		//启动线程
		chat.start();
		eat.start();
		drink.start();
	
	}
}
