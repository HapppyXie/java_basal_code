package com.study.���߳�3�̼߳䲻ͨ��;

/*
 * 
 * �ṩ�ؼ�Ʊ�������ؼ�Ʊ-�̲߳�ͨ��
 * �ṩ�ؼ�Ʊ�������ؼ�Ʊ-�̼߳�ͨ��
 * 
 * 		 |����>		ƱԴ  	 	<����|
 * 		�ṩ��	----ͨ��-	--->	������
 * 
 * */
public class Task06�̼߳䲻ͨ�� {
	public static void main(String[] args) {
		//����ƱԴ(�����ߺ�������ʹ��ͬһƱԴ)
		TicketSource source = new TicketSource();
		//����������
		ProvidTicket provider = new ProvidTicket(source);
		//����������
		BuyTicket  buyer = new BuyTicket(source);
		
		//�����߳�
		Thread pthread = new Thread(provider);
		Thread bthread = new Thread(buyer);
		//�����߳�
		pthread.start();//�˴�ִ����
		bthread.start();//�˴�һ��ʼִ��i=0������
	}
}
