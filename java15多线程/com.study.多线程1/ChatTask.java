package com.study.多线程1;

public class ChatTask implements Runnable{
	public void run() {
		for(int i = 0 ; i < 130 ; i++) {
			System.out.println("---------聊天----------");
			try {
				//休眠10秒，模拟cpu
				//每执行一次就休眠一次
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
