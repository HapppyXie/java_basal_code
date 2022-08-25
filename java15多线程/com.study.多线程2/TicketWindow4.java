package com.study.多线程2;

public class TicketWindow4 implements Runnable{
	private int tickets = 100;
	public void run() {
		while(true) {
			sale();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}
	
	/*
	 * 同步方法
	 * 把单次执行的任务设计成一个方法步骤
	 * */
	public synchronized void sale() {
		if(tickets > 0) {
			System.out.println(Thread.currentThread().getName()+"----------销售第:"+tickets--+"张票");
		}
	}

}
