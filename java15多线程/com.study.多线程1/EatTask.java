package com.study.���߳�1;

public class EatTask implements Runnable{

	public void run() {
		for(int i =0; i < 20 ; i++) {
			System.out.println("---------�Է�----------");
				try {
					//����20�룬
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

}
