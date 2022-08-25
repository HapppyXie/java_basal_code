package com.study.�α���ϰ3;

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
	
	
	//synchronized ������з���������ס��ʹ�������� ��myStack����
	public synchronized void push(char c) {
		
			this.notify();
			data[index] = c;
			index++;
		
	}
	//ɾ�����һ��Ԫ��,����ɾ��������һ��Ԫ��
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
		//a,b��ѹ��ѹ������ǲ�֪��Ϊʲô 
		a.sleep(100);
		b.start();
		
		
	}

}
