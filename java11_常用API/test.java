package testMyself;

import java.util.Arrays;

public class test implements Runnable{
	private String w = "��������������";
	public static void main(String[] args) {
		String s = "�ҵ�С�����첻�Ǻܿ��У��Ҳ�֪����ô�찡������";
		System.out.println(s.codePointAt(0));//����s��ָ�����ַ���gbk�еı����ڵڼ�λ
		System.out.println(s.lastIndexOf("��"));
		System.out.println(s.indexOf("��"));
		
		String w = "�Ҳ�֪��";
		String [] r = s.split("��");
		System.out.println(Arrays.toString(r));
		String g = "     a5     ";
		System.out.println(g.strip());
		
		System.out.println("--------------");
		String s1 = "1";
		String s2 = "2";
		String s3 =s1+s2;//"12" ֻ�ڶ��У��������⣩����
		System.out.println(s3);
		
		String s4 = s3;//��s3�Ķѵ�ַ����s4
		System.out.println(s3==s4);//true
		
		String s5 = "12";//�ڳ������д���"12"
		System.out.println(s3==s5);//false
		//˵��ͨ���ַ���+�ַ����õ��ģ����ڶ��д������������⣩
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
