package com.study.多线程3线程间不通信;

public class BuyTicket implements Runnable{
	private TicketSource source;
	
	public BuyTicket(TicketSource source) {
		this.source = source;
	}
	
	public void run() {
		while(true) {
			int no = source.getTickets();
			System.out.println("购买第 "+no+" 张特价票");
			if(no == 0) {
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
