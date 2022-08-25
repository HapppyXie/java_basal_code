package com.study.多线程2;

public class BuySaleTask implements Runnable{
	private boolean flag;
	 static Object tickets = 100;
	 static Object money = 100;		
//如果没有static，每个对象都tickets，money,可以开锁程序将继续执行
//但设计时要用static
	public BuySaleTask(boolean flag) {
		this.flag = flag;
	}
	
	//线程任务
	public void run(){
		if(flag) {
			//购票者线程
			while(true) {
				synchronized(tickets) {
					System.out.println(Thread.currentThread().getName()+"---if---先给我票");
					synchronized(money) {
						System.out.println(Thread.currentThread().getName()+"---if---再给你钱");				
					}
				}
				System.out.println("---------交易开始----------");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
		}else {
			while(true) {
				synchronized(money) {
					System.out.println(Thread.currentThread().getName()+"---if---先给我钱");
					synchronized(tickets) {
						System.out.println(Thread.currentThread().getName()+"---if---再给你票");
					}
				}
				System.out.println("--------交易开始----------");
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
