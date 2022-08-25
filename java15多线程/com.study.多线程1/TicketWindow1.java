package com.study.多线程1;

public class TicketWindow1 extends Thread{
	private static int tickets = 100;//使用static使数据共享
	
	public synchronized void run() {
		while(tickets > 0) {	
			if(tickets == 0 ) {
					break;
			}
				System.out.println("----------销售第:"+tickets--+"张票");
			try {
				Thread.sleep(10);
			} catch ( InterruptedException e) {
			e.printStackTrace();
				}
		}
	}

}
