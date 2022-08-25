package Homework;

import java.util.Random;
import java.util.Scanner;

/*����ͨ���ֻ���ע�ᣬ
 * 		���������д��ĸ��Сд��ĸ�����֣��������(4������)
 * 		���������֤
 * ������
 * 1.�����ֻ��ţ���֤��
 * 2.�������루��֤��
 * 3.������֤��(5λ)
 * 4.������֤�벢�Ƚ�
 * */
public class Homework03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("----------�û�ע��------------");
		inputPhone();
		inputPassword();
		String code = createCode();
		System.out.println("��֤��Ϊ:"+code);
		inputCode(code);
		
	}
	
	private static void inputPhone() {
		System.out.println("--------�������ֻ��ţ�----------");
		String phone = "";
		String regex = "^1[0-9]{10}$";
		while(true) {
			phone = sc.next();
			if(!phone.matches(regex)) {
				System.out.println("�ֻ��Ÿ�ʽ�������������룡");
			}else {
				break;
			}
		}
		System.out.println("�ֻ���Ϊ:"+phone);
	}
	private static void inputPassword() {
		System.out.println("---------����������-----------");
			String password = "";
			//���������д��ĸ��Сд��ĸ�����֣�������ţ��������»���(4������)��ǰ��4����ģʽ�ų�����3�����ݵ����
			String regex ="(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+&)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{8,}$";
			while(true) {
				password = sc.next();
				if(!password.matches(regex)) {
					System.out.println("�������д�Сд��ĸ�����֣��Ͳ������»��ߵķ������");
					System.out.println("����������");
				}else {
					break;
				}
			}
			System.out.println("����Ϊ:"+password);
	}
	
	/*
	 * �����дСд��ĸ��������� 5���ַ�
	 * �������ַ����ŵ�һ���ַ������У�Ȼ�������������ȡ���ַ�
	 * */
	private static String createCode() {
		StringBuilder sb = new StringBuilder();
		char [] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 
				't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 
				'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 
				'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', 
				'7', '8', '9'};
			for(int i = 0; i < 5; i++) {
				Random r = new Random();
				int index = r.nextInt(ch.length);
				char getCh = ch[index];
				sb.append(getCh);
			}
		return sb.toString();
	}
	private static void inputCode(String code) {
		System.out.println("----------��������֤��--------------");
		String input ="";
		while(true) {
			input = sc.next();
			if(input.equalsIgnoreCase(code)) {
				System.out.println("ע��ɹ�");
				break;
			}{
				System.out.println("��֤�����,����������");
			}
			
		}
		
	}

}
