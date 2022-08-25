package com.study.多线程3线程间通信;

public class BuyTicket implements Runnable{
	private TicketSource source;
	
	public BuyTicket(TicketSource source) {
		this.source = source;
	}
	
	public void run() {
		while(true) {
			synchronized(source) {
				//1.判断并等待
				while(!source.hasNewTicket()) {
					try {
						//没票等待
						source.wait();//暂停线程的执行
					} catch (InterruptedException e) {
					e.printStackTrace();
					}
				}
				//2.有票及时取票
				int no = source.getTickets();
				System.out.println("购买第 "+no+" 张票");
				if(no == 10) {
					break;//购买到第10张票退出系统
				}
				//3.通知
				source.notify();
			}
			//4.休眠
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
