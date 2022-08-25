package com.study.课本练习1;

import java.util.Vector;

public class SyncStack {
	private Vector<Character> buffer = new Vector<Character>(400,200);
	
	//消费者调用该方法进行消费
	public synchronized char pop() {
		char c;
		while(buffer.size()==0) {
			try {
				this.wait();
	//当该共享资源为空时,该线程进入SyncStack的wait pool并释放SyncStack的锁
				//该线程停在此处，不再往下走
			} catch (Exception e) {		}
		}	
	
		c=((Character)buffer.remove(buffer.size()-1)).charValue();
		return c;		
	}
	
	public synchronized void push(char c) {
		//使某个线程进入lock pool 等待push执行完,释放锁
		Character charobj = new Character(c);
		buffer.addElement(charobj);
		this.notify(); 
	}
	
	
}
