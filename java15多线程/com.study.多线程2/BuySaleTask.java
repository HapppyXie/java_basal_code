package com.study.���߳�2;

public class BuySaleTask implements Runnable{
	private boolean flag;
	 static Object tickets = 100;
	 static Object money = 100;		
//���û��static��ÿ������tickets��money,���Կ������򽫼���ִ��
//�����ʱҪ��static
	public BuySaleTask(boolean flag) {
		this.flag = flag;
	}
	
	//�߳�����
	public void run(){
		if(flag) {
			//��Ʊ���߳�
			while(true) {
				synchronized(tickets) {
					System.out.println(Thread.currentThread().getName()+"---if---�ȸ���Ʊ");
					synchronized(money) {
						System.out.println(Thread.currentThread().getName()+"---if---�ٸ���Ǯ");				
					}
				}
				System.out.println("---------���׿�ʼ----------");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
		}else {
			while(true) {
				synchronized(money) {
					System.out.println(Thread.currentThread().getName()+"---if---�ȸ���Ǯ");
					synchronized(tickets) {
						System.out.println(Thread.currentThread().getName()+"---if---�ٸ���Ʊ");
					}
				}
				System.out.println("--------���׿�ʼ----------");
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
