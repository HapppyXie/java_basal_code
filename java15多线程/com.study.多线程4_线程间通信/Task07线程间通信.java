package com.study.���߳�3�̼߳�ͨ��;

/*
 * 
 * 
 * �ṩ�ؼ�Ʊ�������ؼ�Ʊ-�̲߳�ͨ�� 
 * �ṩ�ؼ�Ʊ�������ؼ�Ʊ-�̼߳�ͨ��
 * 
 * 		 |����>		ƱԴ  	 	<����|
 * 		�ṩ��	----ͨ��-	--->	������
 * 
 * */
public class Task07�̼߳�ͨ�� {
	public static void main(String[] args) {
		//����ƱԴ(�����ߺ�������ʹ��ͬһƱԴ)
		TicketSource source = new TicketSource();
		//���������ߣ��൱�ڴ����߳�����
		ProvidTicket provider = new ProvidTicket(source);
		//����������
		BuyTicket  buyer = new BuyTicket(source);
		
		//�����߳�
		Thread pthread = new Thread(provider);
		Thread bthread = new Thread(buyer);
		//�����߳�
		pthread.start();//�߳�ͬʱ����
		bthread.start();
	}
}
