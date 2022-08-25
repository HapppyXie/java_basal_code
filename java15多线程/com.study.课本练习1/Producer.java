package com.study.课本练习1;

public class Producer implements Runnable{
	private SyncStack theStack;
	private int num;
	private static int counter = 1;
	
	public Producer(SyncStack s) {
		this.theStack = s;
		num = counter++;
	}
	//每次随机产生一个字母放入堆栈，然后休眠300ms，共进行200次
	public void run() {
		char c;
		for(int i =0; i<20;i++) {
			c=(char)(Math.random()*26+'A');
			theStack.push(c);
			System.out.println("Producer"+num+":"+c);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
