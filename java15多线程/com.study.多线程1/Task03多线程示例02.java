package com.study.���߳�1;
/*
 * ���̻߳���ʵ��
 * 
 * 1.�̳�Thread�࣬
 * 			1���Զ����̼̳߳�Thread�࣬��дrun������
 * 							
 * 			2)�����������߳�
 * 							MyThread thread = new MyThread();
 * 							thread.start();	
 * 	ChatThread
 * 	DrinkThread
 * 	EatThread
 * 
 * 
 * 2.ʵ��Runnable�ӿ�  
 * 		1������߳����� Class ThreadTask implments Runnable{
 * 						//��дrun����
 * 						public void run(){
 * 							//�߳�����
 * 							}
 * 						}
 * 		2.�����߳�������� �ٴ���Thread����
 * 				ThreadTask task = new ThreadTask();
 * 				Thread thread = new Thread(task);
 * 					thread.start();
 *  ChatTask
 *  EatTask
 *  DrinkTaask
 *  
 *  ע��
 *   1.Thread�����ʵ����Runnable�ӿ�
 *   2.�Զ����߳�ʵ��Runnable�ӿڿ��Ա���Java�ĵ��̳�����
 *   3.ʵ��Runnable�ӿڵķ�ʽ�����ӷ�������������˼�룬
 *   					�̷߳�Ϊ�����֣�һ����Ϊ�̶߳���һ����Ϊ�߳�����
 *   4.���մ����̶߳������ʹ��Thread��������
 *   					�����߳��õ�ʱThread���start()����
 * */
public class Task03���߳�ʾ��02 {
		public static void main(String[] args) {
			//�����߳�����
			ChatTask c = new ChatTask();
			EatTask e = new EatTask();
			DrinkTask d = new DrinkTask();
			//�����̶߳���
			Thread tc = new Thread(c);
			Thread te = new Thread(e);
			Thread td = new Thread(d);
			///�����߳�
			tc.start();
			te.start();
			td.start();
			
		}
}
