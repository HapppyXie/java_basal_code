package com.study.�α���ϰ2;

/*
 * extends Thread  �����̶߳���
 * implements Runnable �ȴ����߳��壬�ٴ����̶߳���
 * */
public class testThread {
	public static void main(String[] args) throws InterruptedException {
		
		Hello h1 = new Hello("  �߳�1");
		Hello h2 = new Hello("  �߳�2");
		
		Thread h3 = new Thread(new Hellos(),"  �߳�3");
		Thread h4 = new Thread(new Hellos(),"  �߳�4");
		
		
		System.out.println(h1.getPriority());
		System.out.println(h2.getPriority());
		
		h1.setPriority(Thread.MAX_PRIORITY);
		h2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(h1.getPriority());
		System.out.println(h2.getPriority());
		
		
		h1.start();
		//h1.stop();
		h2.start();
		h2.join();//join() stop()���̷߳���Ӧ���������߳�������
					
		h1.sleep(20);//��ͬ��������
		System.out.println(Thread.currentThread());
		h1.yield();//ͬ��������
		
		System.out.println(h1.isAlive());
		System.out.println("--------------------------");
		
		h3.start();
		h4.start();
		
		
		
	}
}
