package com.study.���߳�3�̼߳䲻ͨ��;

public class ProvidTicket implements Runnable{
	//ƱԴ-�ؼ�Ʊ�ṩ������ƱԴ���ṩƱ
	private TicketSource source;
	
	public ProvidTicket(TicketSource source) {
		this.source = source;
	}

	//�߳��������߳��ṩ�ڼ���Ʊ,����ӡ����
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("�ṩ�� "+i+" ���ؼ�Ʊ");
			source.setTickets(i);
			//��������ʱ��
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
	
	//�߳�����
	
}
