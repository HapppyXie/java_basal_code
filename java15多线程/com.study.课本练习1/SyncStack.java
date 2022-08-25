package com.study.�α���ϰ1;

import java.util.Vector;

public class SyncStack {
	private Vector<Character> buffer = new Vector<Character>(400,200);
	
	//�����ߵ��ø÷�����������
	public synchronized char pop() {
		char c;
		while(buffer.size()==0) {
			try {
				this.wait();
	//���ù�����ԴΪ��ʱ,���߳̽���SyncStack��wait pool���ͷ�SyncStack����
				//���߳�ͣ�ڴ˴�������������
			} catch (Exception e) {		}
		}	
	
		c=((Character)buffer.remove(buffer.size()-1)).charValue();
		return c;		
	}
	
	public synchronized void push(char c) {
		//ʹĳ���߳̽���lock pool �ȴ�pushִ����,�ͷ���
		Character charobj = new Character(c);
		buffer.addElement(charobj);
		this.notify(); 
	}
	
	
}
