package com.study.���߳�3�̼߳䲻ͨ��;

public class BuyTicket implements Runnable{
	private TicketSource source;
	
	public BuyTicket(TicketSource source) {
		this.source = source;
	}
	
	public void run() {
		while(true) {
			int no = source.getTickets();
			System.out.println("����� "+no+" ���ؼ�Ʊ");
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
