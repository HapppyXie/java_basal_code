package com.study.多线程3线程间通信;

public class ProvidTicket implements Runnable{
	//票源-特价票提供者需向票源中提供票
	private TicketSource source;
	
	public ProvidTicket(TicketSource source) {
		this.source = source;
	}
	//private boolean hasNewTicket;

	//线程任务，向线程提供第几张票,并打印出来
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			synchronized(source) {
				//此处为锁对象
				//1.判断并等待 此处考虑现实中没有取票情况
				while(source.hasNewTicket()) {
					try {
						//如果没有取票
						source.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//2.没票则即使提供
				System.out.println("提供第 "+i+" 张票");
				source.setTickets(i);
				//3.通知
				source.notify();//唤醒刚刚wait的线程
			}
			//设置休眠时间
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			e.printStackTrace();
				}
			}
		}
	}