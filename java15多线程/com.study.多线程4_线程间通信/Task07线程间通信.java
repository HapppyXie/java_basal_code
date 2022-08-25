package com.study.多线程3线程间通信;

/*
 * 
 * 
 * 提供特价票和抢购特价票-线程不通信 
 * 提供特价票和抢购特价票-线程间通信
 * 
 * 		 |——>		票源  	 	<——|
 * 		提供者	----通信-	--->	购买者
 * 
 * */
public class Task07线程间通信 {
	public static void main(String[] args) {
		//创建票源(生产者和消费者使用同一票源)
		TicketSource source = new TicketSource();
		//创建生产者，相当于创建线程任务
		ProvidTicket provider = new ProvidTicket(source);
		//创建消费者
		BuyTicket  buyer = new BuyTicket(source);
		
		//创建线程
		Thread pthread = new Thread(provider);
		Thread bthread = new Thread(buyer);
		//启动线程
		pthread.start();//线程同时启动
		bthread.start();
	}
}
