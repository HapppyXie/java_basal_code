package com.study.多线程1;
/*
 * 人—生活状态多样 
 * 操作系统-多任务(qq,java,wechat)	 操作系统在某个时刻运行多个程序
 * 								 实际为cpu分时执行
 * 
 * 进程多任务	分析qq：qq属于一个进程
 * 			启动一个聊天窗口：启动接受信息的进程
 * 						 启动发送信息的进程
 * 			说明：线程并发  一个时刻中某一个时刻运行多个线程
 * 				对cpu再次划分时间片
 * 				接受和发送交替占用cpu资源
 * 				
 * 多线程目的：提高资源利用率(提高效率)
 * 			cpu消耗调度去切换资源(不会提高速度)
 * 
 * 身边的多线程:桌面应用软件
 * 			WEB服务（高并发，高性能趋向）
 * 		
 * */
public class Task01 {
	public static void main(String[] args) {
		//单线程模式示例 聊天->吃饭-》喝酒  一个运行完下一个 
		chart();
		eat();
		drink();
		//而多线程  聊天->聊天->吃饭->聊天->喝酒->聊天
	}

	private static void chart() {
		for(int i = 0; i < 10 ; i++) {
			System.out.println("------------聊天-------------");
		}
	}

	private static void eat() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("----------吃饭--------------");
		}
	}

	private static void drink() {
		for(int i = 0 ; i < 10 ;i++) {
			System.out.println("-----------喝酒-------------");
		}
	}

}
