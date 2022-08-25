package com.study.多线程3线程间不通信;

public class ProvidTicket implements Runnable{
	//票源-特价票提供者需向票源中提供票
	private TicketSource source;
	
	public ProvidTicket(TicketSource source) {
		this.source = source;
	}

	//线程任务，向线程提供第几张票,并打印出来
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("提供第 "+i+" 张特价票");
			source.setTickets(i);
			//设置休眠时间
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
	
	//线程任务
	
}
