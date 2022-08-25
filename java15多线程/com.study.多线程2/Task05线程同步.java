package com.study.多线程2;
/*
 * 线程同步方案:
 *			同步块synchronized(lock){}  lock需为Object对象  有lock属性的对象即可开锁
 * 			同步方法 public synchronized void sale()
 * 			把共享数据的单次操作同步，保证一次操作完整(以使不会出现一个数据几个表达)
 * 			注意：测试时不要把休眠时间放到同步块或同步方法中(致使休眠无效,无法模拟售票过程)
 * 
 * 死锁问题:	售票者：给钱才给票
 * 		  	买票这：给票才给钱
 * 		  
 * 死锁问题解决：两个线程都需要对方的占用的才能继续执行
 * 			 锁只有一个（static），有一个线程占用了，其他线程就得不到了
 * 
 * 
 * */

import com.study.多线程1.TicketWindow2;

public class Task05线程同步 {
		public static void main(String[] args) {
			//创建一个线程任务
			TicketWindow3 task1 = new TicketWindow3();
			//创建线程
			Thread window1 = new Thread(task1,"窗口1");
			Thread window2 = new Thread(task1,"窗口2");
			Thread window3 = new Thread(task1,"窗口3");
			Thread window4 = new Thread(task1,"窗口4");
			//启动线程
			window1.start();
			window2.start();//一个类实现了Runnable接口，其对象调用start()->调用run()
			window3.start();
			window4.start();
			
			
//			//创建一个线程任务
//			TicketWindow4 task2 = new TicketWindow4();
//			//创建线程
//			Thread window5 = new Thread(task2,"窗口1");
//			Thread window6 = new Thread(task2,"窗口2");
//			Thread window7 = new Thread(task2,"窗口3");
//			Thread window8 = new Thread(task2,"窗口4");
//			//启动线程
//			window5.start();
//			window6.start();//一个类实现了Runnable接口，其对象调用start()->调用run()
//			window7.start();
//			window8.start();

			
			//创建线程任务
			BuySaleTask t1 = new BuySaleTask(true);//购票者
			BuySaleTask t2 = new BuySaleTask(false);//售票者
			//创建线程
			new Thread(t1,"购票者").start();
			new Thread(t2,"售票者").start();
			}
}
