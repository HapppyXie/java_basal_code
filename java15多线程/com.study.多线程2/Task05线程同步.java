package com.study.���߳�2;
/*
 * �߳�ͬ������:
 *			ͬ����synchronized(lock){}  lock��ΪObject����  ��lock���ԵĶ��󼴿ɿ���
 * 			ͬ������ public synchronized void sale()
 * 			�ѹ������ݵĵ��β���ͬ������֤һ�β�������(��ʹ�������һ�����ݼ������)
 * 			ע�⣺����ʱ��Ҫ������ʱ��ŵ�ͬ�����ͬ��������(��ʹ������Ч,�޷�ģ����Ʊ����)
 * 
 * ��������:	��Ʊ�ߣ���Ǯ�Ÿ�Ʊ
 * 		  	��Ʊ�⣺��Ʊ�Ÿ�Ǯ
 * 		  
 * �����������������̶߳���Ҫ�Է���ռ�õĲ��ܼ���ִ��
 * 			 ��ֻ��һ����static������һ���߳�ռ���ˣ������߳̾͵ò�����
 * 
 * 
 * */

import com.study.���߳�1.TicketWindow2;

public class Task05�߳�ͬ�� {
		public static void main(String[] args) {
			//����һ���߳�����
			TicketWindow3 task1 = new TicketWindow3();
			//�����߳�
			Thread window1 = new Thread(task1,"����1");
			Thread window2 = new Thread(task1,"����2");
			Thread window3 = new Thread(task1,"����3");
			Thread window4 = new Thread(task1,"����4");
			//�����߳�
			window1.start();
			window2.start();//һ����ʵ����Runnable�ӿڣ���������start()->����run()
			window3.start();
			window4.start();
			
			
//			//����һ���߳�����
//			TicketWindow4 task2 = new TicketWindow4();
//			//�����߳�
//			Thread window5 = new Thread(task2,"����1");
//			Thread window6 = new Thread(task2,"����2");
//			Thread window7 = new Thread(task2,"����3");
//			Thread window8 = new Thread(task2,"����4");
//			//�����߳�
//			window5.start();
//			window6.start();//һ����ʵ����Runnable�ӿڣ���������start()->����run()
//			window7.start();
//			window8.start();

			
			//�����߳�����
			BuySaleTask t1 = new BuySaleTask(true);//��Ʊ��
			BuySaleTask t2 = new BuySaleTask(false);//��Ʊ��
			//�����߳�
			new Thread(t1,"��Ʊ��").start();
			new Thread(t2,"��Ʊ��").start();
			}
}
