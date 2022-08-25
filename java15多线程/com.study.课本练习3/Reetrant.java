package com.study.课本练习3;

public class Reetrant {
	public synchronized void a() {
		b();
		System.out.println("here I am, in a()");
	}
	public synchronized void b() {
		System.out.println("here I am, in b()");
	}
	
	public static void main(String[] args) {
		Reetrant r = new Reetrant();
		r.a();//调用a()时获得r的锁，a()中调用b()时，由于对象锁的可重入性，再获取r的锁
		
	}
}
