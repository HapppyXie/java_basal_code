package com.study.多线程3线程间通信;

public class TicketSource {
	//默认无参构造
	//提供特价票
	private int tickets;
	//判断票源状态
	private boolean newTicket = false;
	//取票
	public int getTickets() {
		this.newTicket=false;
		return tickets;
	}
	//给票
	public void setTickets(int tickets) {
		this.tickets = tickets;
		this.newTicket = true;
	}
	
	public boolean hasNewTicket() {
		return this.newTicket;
		
	}

}
