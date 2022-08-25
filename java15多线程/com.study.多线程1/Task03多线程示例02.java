package com.study.多线程1;
/*
 * 多线程基本实现
 * 
 * 1.继承Thread类，
 * 			1）自定义线程继承Thread类，重写run方法，
 * 							
 * 			2)创建并启动线程
 * 							MyThread thread = new MyThread();
 * 							thread.start();	
 * 	ChatThread
 * 	DrinkThread
 * 	EatThread
 * 
 * 
 * 2.实现Runnable接口  
 * 		1）设计线程任务 Class ThreadTask implments Runnable{
 * 						//重写run方法
 * 						public void run(){
 * 							//线程任务
 * 							}
 * 						}
 * 		2.创建线程任务对象 再创建Thread对象
 * 				ThreadTask task = new ThreadTask();
 * 				Thread thread = new Thread(task);
 * 					thread.start();
 *  ChatTask
 *  EatTask
 *  DrinkTaask
 *  
 *  注意
 *   1.Thread本身就实现了Runnable接口
 *   2.自定义线程实现Runnable接口可以避免Java的单继承问题
 *   3.实现Runnable接口的方式，更加符合面向对象解耦思想，
 *   					线程分为两部分，一部分为线程对象，一部分为线程任务
 *   4.最终创建线程对象必须使用Thread或其子类
 *   					启动线程用的时Thread类的start()方法
 * */
public class Task03多线程示例02 {
		public static void main(String[] args) {
			//创建线程任务
			ChatTask c = new ChatTask();
			EatTask e = new EatTask();
			DrinkTask d = new DrinkTask();
			//创建线程对象
			Thread tc = new Thread(c);
			Thread te = new Thread(e);
			Thread td = new Thread(d);
			///启动线程
			tc.start();
			te.start();
			td.start();
			
		}
}
