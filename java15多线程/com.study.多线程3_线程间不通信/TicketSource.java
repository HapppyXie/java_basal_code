package com.study.多线程3线程间不通信;

public class TicketSource {
	//提供特价票
	private int tickets;
	
	//取票
	public int getTickets() {
		return tickets;
	}
	//给票
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

}
