package com.study.���߳�3�̼߳�ͨ��;

public class TicketSource {
	//Ĭ���޲ι���
	//�ṩ�ؼ�Ʊ
	private int tickets;
	//�ж�ƱԴ״̬
	private boolean newTicket = false;
	//ȡƱ
	public int getTickets() {
		this.newTicket=false;
		return tickets;
	}
	//��Ʊ
	public void setTickets(int tickets) {
		this.tickets = tickets;
		this.newTicket = true;
	}
	
	public boolean hasNewTicket() {
		return this.newTicket;
		
	}

}
