package com.study.���߳�2;

public class TicketWindow3 implements Runnable{
	private int tickets =100;
	//����ͬ����
	Object lock = new Object();
	public void run() {
		while(true) {
			 //�����β�������һ��ͬ������,ͬһʱ��ֻ����һ���߳̽���
			synchronized(lock){
				if(tickets>0) {
					System.out.println(Thread.currentThread().getName()+"----------���۵�:"+tickets--+"��Ʊ");
				 }
			}
			try {
				//ģ����Ʊ���̣�����
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
