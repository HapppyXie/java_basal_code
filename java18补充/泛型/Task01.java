package java����;

import java.util.List;

// ������⣬���ͣ��Ƕ���������һЩ���Ͳ�ȷ�����ȷ�ָ������
class fu<T, T2>{//���ڲ�֪����ʲô���ͣ��ȴ�������ʱ�������Ͳ���
			// ���Ϳ�д���, �����������ʵ��ʱ����ָ�����ͣ���Ĭ��ΪObject����
	private T t1;
//	private T t2 = new T(); �ڷ������в���������������ʵ��

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
	
}

//���ͼ̳�
class zi1<T,T2> extends fu<T,T2>{
	/*  ָ��д����1.������ʲô������д
	 * 			2.ֱ��ָ�����ͣ��̳й�ȥҲָ����
	 * */
	private T t1;
	private T2 t2;

	public T getT1andT2() {
		return t1;
	}

	public void setT1(T t1, T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	
	
}
class yi1 extends fu<String,Integer>{
	private String s1;
	private int i1;
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public int getI1() {
		return i1;
	}
	public void setI1(int i1) {
		this.i1 = i1;
	}
	
}

class gi1<T1 extends List>{
	protected T1 t1;
	
}

public class Task01 {
	public static void main(String[] args) {
		Object o;
		o = new Float(12.13);
		System.out.println(o);
		//o = new Integer(14);
		//System.out.println(o); //Object - Float ������������������ͣ�����
    //���� ����Integer����Float�����ʱ��Integer - Float ������
		//Integer i = (Integer)o;  �˴��Ƿ�
		//����-�����ȫ����   ���� class ����<������>{   }   ��������������һ��
		
		
		//�����귺�����,�����������ָ�����ͣ����Զ�ָ��Object����
		fu f1 = new fu();  //f1ΪObject����
		fu<String, Integer> f2 = new fu<>();
		f2.setT1(null);
		f2.getT1();
		
		zi1 z1 = new zi1(); //�̳к�ָ����zi1Ĭ��ΪObject��
		
		//��һ��ָ����
		zi1<String,Integer> z2 = new zi1(); //��ʱ��zi2ΪT �� T2 ��
											//������ ΪString��Integer��
		z2.setT1(null); // ��Ϊ���෽��
		z2.setT1(null, null); // ��Ϊ����zi1����
		//�ڶ���ָ����
		yi1 y1 = new yi1();
		
		//����δ�̳�ʱ��ʲô���Ͷ�����
		//gi1<String> g1 = new gi1<String>();
		//�̳к��д�ռ̳з�������
		 gi1<List> g2 = new gi1<List>();
		
		
	}

}
