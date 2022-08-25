package com.study.课本练习3;

public class myStack {
	private int index = 0;
	private char[] data =new char[6];
		
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public char[] getData() {
		return data;
	}
	public void setData(char[] data) {
		this.data = data;
	}
	
	
	//synchronized 如果所有方法都需锁住，使用锁方法 锁myStack对象
	public synchronized void push(char c) {
		
			this.notify();
			data[index] = c;
			index++;
		
	}
	//删除最后一个元素,返回删除后的最后一个元素
	public synchronized char pop() {
		while(this.getIndex()==0) {
			try {
				this.wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
				
			index--;
			return data[index];
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		myStack ms = new myStack();
		A a = new A(ms);
		B b = new B(ms);
		System.out.println(a.getPriority());
		System.out.println(b.getPriority());
		a.start();
		//a,b互压，压到最后是不知道为什么 
		a.sleep(100);
		b.start();
		
		
	}

}
