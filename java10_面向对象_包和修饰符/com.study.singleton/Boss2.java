package com.study.singleton;

public class Boss2 {
	//懒汉式
	//1.私有化静态属性（不创建对象）
	private static Boss2 boss;
	
	//2.构造方法私有化
	private Boss2() {
		System.out.println("执行Boss2构造方法");
	}
	private Boss2(String name) {
		
	}
	
	//3.提供公共静态接口
	public static Boss2 getInstance() {
		if(boss == null) {
			boss = new Boss2();  
		}
		return boss;
	}
}