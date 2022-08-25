package com.study.多线程3线程间通信;

public class Task08线程生命周期及状态转化 {
	public static void main(String[] args) {
		ChatTask task = new ChatTask();
		Thread t1 = new Thread(task);
		t1.start();
		
		//主线程
		for(int i = 0 ;i < 10; i++) {
			System.out.println("主线程运行-------"+i);
			//主线程运行出现阻塞，观察发现i=0时出现t1线程
			if(i==0) {
				try {
					t1.join();//使其线程执行连在一起,线程插队	其他阻塞
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
		}
	}
}

class ChatTask implements Runnable{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("---------聊天----------"+i);
			try {
				//休眠10毫秒，模拟cpu
				//每执行一次就休眠一次
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}