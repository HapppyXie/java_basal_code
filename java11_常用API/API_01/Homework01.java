package API��������1;

import java.util.Scanner;


/*
 * ������ʽӦ�ð���
 * 1.�ֻ��ŵ�¼��֤  
 * ��������ĳϵͳ��¼��Ҫ�����ֻ��ź���֤��
 * 		1.�ֻ��ű�����11λ���֣���ͷ����Ϊ1
 * 		2.������֤�������6λ����
 * 
 * 2.������ʽ
 * 
 * */
public class Homework01 {
/*
 * ��������ĳϵͳ��¼��Ҫ�����ֻ��ź���֤��
 * 		1.�ֻ��ű�����11λ���֣���ͷ����Ϊ1
 * 		2.������֤�������6λ����
 * 		��ʹ��ԭ��API
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����¼ϵͳ��");
		String phone = "";
		String code ="";
		while(true) {
			System.out.println("13428334846-ʾ��");
			System.out.println("�������ֻ��ţ�");
			phone = sc.next();
			
//			if(phone.length() != 11) {
//				System.out.println("�ֻ���ӦΪ11λ���֣�");
//				continue;
//			}
//			if(phone.charAt(0) != '1') {
//				System.out.println("�ֻ��ŵ�һλӦΪ1��");
//				continue;
//			}
//			if(!(phone.charAt(1)>='0' && phone.charAt(1)<='9' &&
//					phone.charAt(2)>='0' && phone.charAt(2)<='9' &&
//					phone.charAt(3)>='0' && phone.charAt(3)<='9' &&
//					phone.charAt(4)>='0' && phone.charAt(4)<='9' &&
//					phone.charAt(5)>='0' && phone.charAt(5)<='9' &&
//					phone.charAt(6)>='0' && phone.charAt(6)<='9' &&
//					phone.charAt(7)>='0' && phone.charAt(7)<='9' &&
//					phone.charAt(8)>='0' && phone.charAt(8)<='9' &&
//					phone.charAt(9)>='0' && phone.charAt(9)<='9' &&
//					phone.charAt(10)>='0' && phone.charAt(10)<='9')){
//				System.out.println("�ֻ��������ȫ������!");
//				continue;
//			}
			
			//����д����������������ʽ
		/*
		 * String���һ������
			 * 			public boolean matches(String regex)
			 * 			��֪���ַ����Ƿ�ƥ�������������ʽregex
			 * 			ƥ����ȷʱ����true,ƥ�����ʱ����false
			 * */
					String regex = "^1[0-9]{10}$";
					if(phone.matches(regex)) {
						System.out.println("�����ֻ������ʽ��");
					}else {
						System.out.println("�������ֻ������ʽ!");
						continue;
					}
			break;
		}
		while(true) {
			System.out.println("��������֤�룺");
			System.out.println("123456-ʾ��");
			code = sc.next();
			String regex = "^[0-9]{6}$";
			if(code.matches(regex)) {
				System.out.println("��֤���ʽ����Ҫ��");
			}else {
				System.out.println("��֤�벻���ϸ�ʽҪ��");
				continue;
			}
			break;
		}
		System.out.println("��¼�ɹ���");
		
		
	}
}
