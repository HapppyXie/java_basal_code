package API��������1;

import java.util.Arrays;

//��ʶ�ַ���������API������Щ������õģ�Ԥ��д�õĺ���������
/*
 * �����ࣺString
 * 		 StringBuilder
 * 		 StringBuffer
 * */
public class Task02StringAPI {
	public static void main(String[] args) {
		String s = "Java Shixun";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(4));
		
		String s1 = "a";
		String s2 = "Java Shixun";
		System.out.println(s2.indexOf(s1));//�״γ���λ��
		System.out.println(s2.lastIndexOf("a"));//���һ�γ��ֵ�λ��
		String zh = "tb13428394849";
		boolean result = zh.startsWith("tb");
		System.out.println(result);
		System.out.println(zh.endsWith("9"));
		
		String sfz = "440882200908014055";
		String birthday = sfz.substring(6, 14);//[) ȡͷ��ȡβ
		System.out.println(birthday);
		
		String q ="�������ѧԺ;���¹�;԰��԰;��ѧ��";
		String [] q1 =q.split(";");//regex������ʽ,��������������ʽ�ָ��ַ���
		System.out.println(Arrays.toString(q1));
		
		String g = "     a5     ";
		System.out.println(g.length());
		g = g.trim();//ȡ��ǰ��Ŀո�
		System.out.println(g.length());
		
		String b ="123456789";
		boolean result1 = b.matches("123456");
		System.out.println(result1);
	}

}
