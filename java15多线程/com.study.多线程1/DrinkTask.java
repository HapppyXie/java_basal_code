package com.study.���߳�1;

public class DrinkTask implements Runnable{
	public void run() {
		for(int i = 0 ; i < 20 ; i++) {
			System.out.println("---------�Ⱦ�----------");
			try {
				//����50�룬
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	

}
