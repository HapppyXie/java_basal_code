package com.study.课本练习2;

/*
 * extends Thread  创建线程对象
 * implements Runnable 先创建线程体，再创建线程对象
 * */
public class testThread {
	public static void main(String[] args) throws InterruptedException {
		
		Hello h1 = new Hello("  线程1");
		Hello h2 = new Hello("  线程2");
		
		Thread h3 = new Thread(new Hellos(),"  线程3");
		Thread h4 = new Thread(new Hellos(),"  线程4");
		
		
		System.out.println(h1.getPriority());
		System.out.println(h2.getPriority());
		
		h1.setPriority(Thread.MAX_PRIORITY);
		h2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(h1.getPriority());
		System.out.println(h2.getPriority());
		
		
		h1.start();
		//h1.stop();
		h2.start();
		h2.join();//join() stop()等线程方法应紧紧放在线程启动后
					
		h1.sleep(20);//不同级别退让
		System.out.println(Thread.currentThread());
		h1.yield();//同级别退让
		
		System.out.println(h1.isAlive());
		System.out.println("--------------------------");
		
		h3.start();
		h4.start();
		
		
		
	}
}
