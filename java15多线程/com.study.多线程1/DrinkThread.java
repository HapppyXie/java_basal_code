package com.study.���߳�1;

public class DrinkThread extends Thread{
	public void run() {
		for(int i = 0 ; i < 20 ; i++) {
			System.out.println("---------�Ⱦ�----------");
			try {
				//����50�룬
				Thread.sleep(50);
				System.out.println(Thread.currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
