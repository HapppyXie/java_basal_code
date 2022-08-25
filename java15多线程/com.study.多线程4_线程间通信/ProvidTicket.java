package com.study.���߳�3�̼߳�ͨ��;

public class ProvidTicket implements Runnable{
	//ƱԴ-�ؼ�Ʊ�ṩ������ƱԴ���ṩƱ
	private TicketSource source;
	
	public ProvidTicket(TicketSource source) {
		this.source = source;
	}
	//private boolean hasNewTicket;

	//�߳��������߳��ṩ�ڼ���Ʊ,����ӡ����
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			synchronized(source) {
				//�˴�Ϊ������
				//1.�жϲ��ȴ� �˴�������ʵ��û��ȡƱ���
				while(source.hasNewTicket()) {
					try {
						//���û��ȡƱ
						source.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//2.ûƱ��ʹ�ṩ
				System.out.println("�ṩ�� "+i+" ��Ʊ");
				source.setTickets(i);
				//3.֪ͨ
				source.notify();//���Ѹո�wait���߳�
			}
			//��������ʱ��
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			e.printStackTrace();
				}
			}
		}
	}