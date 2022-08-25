package com.study.多线程1;

public class TicketWindow2 implements Runnable{
	private int tickets =100;
	public void run() {
		while(true) {
			 if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"----------销售第:"+tickets--+"张票");
			 }
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
