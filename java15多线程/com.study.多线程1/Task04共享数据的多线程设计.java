package com.study.���߳�1;

/*
 * Thread ʵ���� Runnable
 * ���ݹ�����߳���ƣ�1.�̳�Thread,��������ʹ�õķ�����ʹ�þ�̬����
 * 				  2.ʵ��Runnable�ӿ�,ʹ��ͬһ���߳��������
 * 
 * 
 * 
 * */
public class Task04�������ݵĶ��߳���� {
	public static void main(String[] args) {
//		//ʵ���˹���˳�򲻶ԣ�����һ���߳�û����ɣ���һ���߳̾ͽ�����(�̲߳���ȫ�������԰�ȫ)
//		//��StringBuilder,ArrayList,HashMap��
//		//���������߳�
//		TicketWindow1 window1 = new TicketWindow1();
//		TicketWindow1 window2 = new TicketWindow1();
//		TicketWindow1 window3 = new TicketWindow1();
//		
//		//���������߳�
//		window1.start();
//		window2.start();
//		window3.start();
//		//static���ݹ��������86��86�ȳ���,��ʹ��ͬ����,������TicketWindow1�����
		
		
		
		//����һ���߳���,����߳�����,����ʹ��static,Ҳ��������������ͬʱ��һ��Ʊ�����,ֻ�������
		//���ʹ���߳���,һ�����ھͻ����꣬�����̵߳ȴ�������wait pool���³������У�����ֹͣ
		TicketWindow2 task = new TicketWindow2();
		//�����߳�
		Thread window1 = new Thread(task,"����1");
		Thread window2 = new Thread(task,"����2");
		Thread window3 = new Thread(task,"����3");
		Thread window4 = new Thread(task,"����4");
		//�����߳�
		window1.start();
		window2.start();//һ����ʵ����Runnable�ӿڣ���������start()->����run()
		window3.start();
		window4.start();
	}

}
