package com.study.���߳�1;

public class EatThread extends Thread{
	public void run() {
		for(int i =0; i < 20 ; i++) {
		System.out.println("---------�Է�----------");
			try {
				//����20�룬
				Thread.sleep(20);
				System.out.println(Thread.currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
