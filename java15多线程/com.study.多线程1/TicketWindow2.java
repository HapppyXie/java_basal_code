package com.study.���߳�1;

public class TicketWindow2 implements Runnable{
	private int tickets =100;
	public void run() {
		while(true) {
			 if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"----------���۵�:"+tickets--+"��Ʊ");
			 }
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
