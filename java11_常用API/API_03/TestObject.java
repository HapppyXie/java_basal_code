package API��������3;

import java.lang.reflect.Method;
import java.util.Arrays;

//Object�� ������ĸ���
/*
 *  getClass()  ���ظ�Object����ʱ��
 *  			����
 *  hashCode()		��ͬ����Ĭ�϶�Ӧ��hashCode��ֵ��ͬ
 *  equals(Object obj)		
 *  toString()		���ض�����ַ�����ʾ�������඼������д
 * */
public class TestObject {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setId(01);
		u1.setName("����");
		System.out.println(u1.toString());
		System.out.println(u1.getClass());
		
		Method[] m1 = u1.getClass().getMethods();
		System.out.println(Arrays.toString(m1));
		
		String s1 = "hello";
		String s2 = "hello";//���equals��ȣ������ϣֵҲ���
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
		int [] a = {10,2,33,6};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
	}

}
