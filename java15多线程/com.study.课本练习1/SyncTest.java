package com.study.¿Î±¾Á·Ï°1;
/*
 * Producer Consumer SyncStack SyncTest
 * 
 * */
public class SyncTest {
	public static void main(String[] args) {
		SyncStack  stack = new SyncStack();
		
		Producer p1 = new Producer(stack);
		Thread pt1 = new Thread(p1);
		
		Producer p2 = new Producer(stack);
		Thread pt2 = new Thread(p2);
		
		Consumer c1 = new Consumer(stack);
		Thread ct1 = new Thread(c1);
		
		Consumer c2 = new Consumer(stack);
		Thread ct2 = new Thread(c2);
		
		pt1.start();
		pt2.start();
		ct1.start();
		ct2.start();
	}

}
