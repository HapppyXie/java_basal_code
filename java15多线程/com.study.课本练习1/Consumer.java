package com.study.�α���ϰ1;

public class Consumer implements Runnable{
	private SyncStack theStack;
	private int num;
	private static int counter = 1;
	
	public Consumer(SyncStack s) {
		this.theStack = s;
		num = counter++;
	}
	//ÿ�δӶ�ջ��ɾ��һ����ĸ��Ȼ������300ms��������200��
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
