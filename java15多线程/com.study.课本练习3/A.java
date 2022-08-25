package com.study.¿Î±¾Á·Ï°3;

public class A extends Thread{
	myStack s;
	char c;
	public A(myStack s) {
		this.s=s;
	}
	public void run() {
		for(int i = 0 ;i<10;i++) {
			if(s.getIndex() < 5) {
				c = (char)(Math.random()*26+'A');
				s.push(c);
				System.out.println("A:push"+c);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
