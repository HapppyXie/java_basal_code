package com.study.�α���ϰ3;

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
		r.a();//����a()ʱ���r������a()�е���b()ʱ�����ڶ������Ŀ������ԣ��ٻ�ȡr����
		
	}
}
