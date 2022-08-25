package com.study.¶àÏß³Ì1;

public class DrinkThread extends Thread{
	public void run() {
		for(int i = 0 ; i < 20 ; i++) {
			System.out.println("---------ºÈ¾Æ----------");
			try {
				//ĞİÃß50Ãë£¬
				Thread.sleep(50);
				System.out.println(Thread.currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
