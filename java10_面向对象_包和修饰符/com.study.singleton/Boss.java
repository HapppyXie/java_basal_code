package com.study.singleton;

public class Boss {
	/*
	 * 饿汉式
	 * */
//1.创建私有静态属性Boss,静态属性创建一个Boss实例
	private static Boss boss = new Boss();
	
	
//2.构造方法私有化
	private Boss() {
		System.out.println("执行Boss构造方法");
	}
	private Boss(String name) {
		
	}
//3.提供静态公共访问接口
	public static Boss getInstance(){
		return boss;
	}
}
