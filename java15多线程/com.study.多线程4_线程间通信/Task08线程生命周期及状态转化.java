package com.study.���߳�3�̼߳�ͨ��;

public class Task08�߳��������ڼ�״̬ת�� {
	public static void main(String[] args) {
		ChatTask task = new ChatTask();
		Thread t1 = new Thread(task);
		t1.start();
		
		//���߳�
		for(int i = 0 ;i < 10; i++) {
			System.out.println("���߳�����-------"+i);
			//���߳����г����������۲췢��i=0ʱ����t1�߳�
			if(i==0) {
				try {
					t1.join();//ʹ���߳�ִ������һ��,�̲߳��	��������
				} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
		}
	}
}

class ChatTask implements Runnable{
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("---------����----------"+i);
			try {
				//����10���룬ģ��cpu
				//ÿִ��һ�ξ�����һ��
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}