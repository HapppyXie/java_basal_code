package java����;

import java.util.ArrayList;
import java.util.List;

class MyBox<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get(){
		return t;
	}
}
//���͵Ķ���
public class TextBook01 {
	public static void main(String[] args) {
		MyBox<Integer> aBox = new MyBox<Integer>();
		aBox.add(new Integer(1000));
		Integer i = aBox.get();
		System.out.println("The Integer is:"+i);
		/*���Ͳ����� E-Element
		 * 		  K-Key
		 * 		  N-Number
		 * 		  T-Type
		 * 		  V-Value
		 * 		 S,U,V - �ɱ��������͵ĵڶ��������ĸ�����
		 * */
		//�����е�����
		//����ı�������ָ������Ķ������౻��Ϊ���븸����ݵ�����
		Object someObject = new Object();
		Integer someInteger = new Integer(10);
		someObject = someInteger;
		System.out.println(someObject);
		
		//����������Ϊ��������������ʹ�������ʼ��
		MyBox<Number> box = new MyBox<Number>();
		box.add(new Integer(10));
		box.add(new Double(10.9));
		System.out.println(box);
		
//		List<String> ls = new ArrayList<String>();  ������ת�͵�Object
//		List<Object> lo = ls;  ���б������಻�ܰ�������ĺܶ���Ϣ
//		lo.add(new Object());   Object��String�ĸ��࣬��List<Object>����List<String>�ĸ���
//		String s = ls.get(0);   
		
	
		
		
	}
}
