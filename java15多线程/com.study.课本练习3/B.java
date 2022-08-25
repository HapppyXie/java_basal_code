package com.study.¿Î±¾Á·Ï°3;

public class B extends Thread{
	myStack s;
	char c;
	public B(myStack s) {
		this.s=s;
	}
	public void run() {	
		for(int i =0; i<10;i++) {
			if(s.getIndex()>0) {
				c = s.pop();
				System.out.println("B:pop"+c);
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}	
	}
	}
}
