package com.study.���߳�1;

public class TicketWindow1 extends Thread{
	private static int tickets = 100;//ʹ��staticʹ���ݹ���
	
	public synchronized void run() {
		while(tickets > 0) {	
			if(tickets == 0 ) {
					break;
			}
				System.out.println("----------���۵�:"+tickets--+"��Ʊ");
			try {
				Thread.sleep(10);
			} catch ( InterruptedException e) {
			e.printStackTrace();
				}
		}
	}

}
