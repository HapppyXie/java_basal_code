package com.study.¿Î±¾Á·Ï°2;

class Hello extends Thread{
	int i;
	String name ="";
	
	public Hello(String name) {
		this.name=name;
	}
	public void run() {
		while(true) {
			System.out.println("Hello"+i++ +this.name);
			if(i==5) break;
		}
	}
}
