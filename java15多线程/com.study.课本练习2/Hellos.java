package com.study.¿Î±¾Á·Ï°2;

public class Hellos implements Runnable{
	int i ;
	public void run() {
		while(true) {
			System.out.println("Hellos"+i+++Thread.currentThread().getName());
			if(i==5) {break;}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
