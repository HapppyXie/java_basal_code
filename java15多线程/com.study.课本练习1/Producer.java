package com.study.�α���ϰ1;

public class Producer implements Runnable{
	private SyncStack theStack;
	private int num;
	private static int counter = 1;
	
	public Producer(SyncStack s) {
		this.theStack = s;
		num = counter++;
	}
	//ÿ���������һ����ĸ�����ջ��Ȼ������300ms��������200��
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
