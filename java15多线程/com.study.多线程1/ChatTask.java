package com.study.���߳�1;

public class ChatTask implements Runnable{
	public void run() {
		for(int i = 0 ; i < 130 ; i++) {
			System.out.println("---------����----------");
			try {
				//����10�룬ģ��cpu
				//ÿִ��һ�ξ�����һ��
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
