package com.study.���߳�2;

public class TicketWindow4 implements Runnable{
	private int tickets = 100;
	public void run() {
		while(true) {
			sale();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}
	
	/*
	 * ͬ������
	 * �ѵ���ִ�е�������Ƴ�һ����������
	 * */
	public synchronized void sale() {
		if(tickets > 0) {
			System.out.println(Thread.currentThread().getName()+"----------���۵�:"+tickets--+"��Ʊ");
		}
	}

}
