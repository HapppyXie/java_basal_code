package com.study.课本练习1;

public class Consumer implements Runnable{
	private SyncStack theStack;
	private int num;
	private static int counter = 1;
	
	public Consumer(SyncStack s) {
		this.theStack = s;
		num = counter++;
	}
	//每次从堆栈中删除一个字母，然后休眠300ms，共进行200次
	public void run() {
		char c;
		for(int i =0; i<20;i++) {			
			c =theStack.pop();
			System.out.println("Consumer"+num+":"+c);
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
