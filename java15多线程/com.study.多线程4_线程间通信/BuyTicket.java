package com.study.���߳�3�̼߳�ͨ��;

public class BuyTicket implements Runnable{
	private TicketSource source;
	
	public BuyTicket(TicketSource source) {
		this.source = source;
	}
	
	public void run() {
		while(true) {
			synchronized(source) {
				//1.�жϲ��ȴ�
				while(!source.hasNewTicket()) {
					try {
						//ûƱ�ȴ�
						source.wait();//��ͣ�̵߳�ִ��
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
				}
				//2.��Ʊ��ʱȡƱ
				int no = source.getTickets();
				System.out.println("����� "+no+" ��Ʊ");
				if(no == 10) {
					break;//���򵽵�10��Ʊ�˳�ϵͳ
				}
				//3.֪ͨ
				source.notify();
			}
			//4.����
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
