package com.study.多线程2;

public class TicketWindow3 implements Runnable{
	private int tickets =100;
	//创建同步锁
	Object lock = new Object();
	public void run() {
		while(true) {
			 //将单次操作放在一个同步块里,同一时刻只予许一个线程进入
			synchronized(lock){
				if(tickets>0) {
					System.out.println(Thread.currentThread().getName()+"----------销售第:"+tickets--+"张票");
				 }
			}
			try {
				//模拟售票过程，休眠
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
