package com.study.���߳�1;

public class ChatThread extends Thread{
	public void run() {
		for(int i = 0 ; i < 130 ; i++) {
			System.out.println("---------����----------");
			try {
				//����10�룬ģ��cpu
				//ÿִ��һ�ξ�����һ��
				Thread.sleep(10);
				System.out.println(Thread.currentThread());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
