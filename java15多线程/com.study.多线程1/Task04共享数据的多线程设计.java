package com.study.多线程1;

/*
 * Thread 实现了 Runnable
 * 数据共享多线程设计：1.继承Thread,共享数据使用的方法是使用静态属性
 * 				  2.实现Runnable接口,使用同一个线程任务对象
 * 
 * 
 * 
 * */
public class Task04共享数据的多线程设计 {
	public static void main(String[] args) {
//		//实现了共享但顺序不对，即是一个线程没有完成，另一个线程就进来了(线程不安全，非线性安全)
//		//如StringBuilder,ArrayList,HashMap等
//		//创建三个线程
//		TicketWindow1 window1 = new TicketWindow1();
//		TicketWindow1 window2 = new TicketWindow1();
//		TicketWindow1 window3 = new TicketWindow1();
//		
//		//启动三个线程
//		window1.start();
//		window2.start();
//		window3.start();
//		//static数据共享后仍有86，86等出现,需使用同步锁,锁的是TicketWindow1这个类
		
		
		
		//创建一个线程体,多个线程运行,无需使用static,也出现了两个窗口同时卖一张票的情况,只是情况少
		//如果使用线程锁,一个窗口就会买完，其他线程等待，进入wait pool导致程序不运行，但不停止
		TicketWindow2 task = new TicketWindow2();
		//创建线程
		Thread window1 = new Thread(task,"窗口1");
		Thread window2 = new Thread(task,"窗口2");
		Thread window3 = new Thread(task,"窗口3");
		Thread window4 = new Thread(task,"窗口4");
		//启动线程
		window1.start();
		window2.start();//一个类实现了Runnable接口，其对象调用start()->调用run()
		window3.start();
		window4.start();
	}

}
