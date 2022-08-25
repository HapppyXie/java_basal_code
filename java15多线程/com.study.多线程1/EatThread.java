package com.study.¶àÏß³Ì1;

public class EatThread extends Thread{
	public void run() {
		for(int i =0; i < 20 ; i++) {
		System.out.println("---------³Ô·¹----------");
			try {
				//ĞİÃß20Ãë£¬
				Thread.sleep(20);
				System.out.println(Thread.currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
