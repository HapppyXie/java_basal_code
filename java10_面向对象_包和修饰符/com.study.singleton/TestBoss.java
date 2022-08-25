package com.study.singleton;

public class TestBoss {
	public static void main(String[] args) {
	Boss boss1 = Boss.getInstance();
	Boss boss2 = Boss.getInstance();
	
	System.out.println(boss1);
	System.out.println(boss1);
	
	
	Boss2 b1 = Boss2.getInstance();  //第一次调用已经执行构造方法，不再构造
	Boss2 b2 = Boss2.getInstance();
	System.out.println(b1);
	System.out.println(b1);
	}
}
