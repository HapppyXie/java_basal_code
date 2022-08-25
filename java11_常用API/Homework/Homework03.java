package Homework;

import java.util.Random;
import java.util.Scanner;

/*需求：通过手机号注册，
 * 		密码包含大写字母，小写字母，数字，特殊符号(4种数据)
 * 		产生随机验证
 * 分析：
 * 1.输入手机号（验证）
 * 2.输入密码（验证）
 * 3.产生验证码(5位)
 * 4.输入验证码并比较
 * */
public class Homework03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("----------用户注册------------");
		inputPhone();
		inputPassword();
		String code = createCode();
		System.out.println("验证码为:"+code);
		inputCode(code);
		
	}
	
	private static void inputPhone() {
		System.out.println("--------请输入手机号：----------");
		String phone = "";
		String regex = "^1[0-9]{10}$";
		while(true) {
			phone = sc.next();
			if(!phone.matches(regex)) {
				System.out.println("手机号格式错误，请重新输入！");
			}else {
				break;
			}
		}
		System.out.println("手机号为:"+phone);
	}
	private static void inputPassword() {
		System.out.println("---------请输入密码-----------");
			String password = "";
			//密码包含大写字母，小写字母，数字，特殊符号，不包括下划线(4种数据)，前面4种子模式排出四种3种数据的组成
			String regex ="(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+&)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{8,}$";
			while(true) {
				password = sc.next();
				if(!password.matches(regex)) {
					System.out.println("密码须有大小写字母，数字，和不包括下划线的符号组成");
					System.out.println("请重新输入");
				}else {
					break;
				}
			}
			System.out.println("密码为:"+password);
	}
	
	/*
	 * 随机大写小写字母，数字组合 5个字符
	 * 把所有字符都放到一个字符数组中，然后随机生成索引取出字符
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
		System.out.println("----------请输入验证码--------------");
		String input ="";
		while(true) {
			input = sc.next();
			if(input.equalsIgnoreCase(code)) {
				System.out.println("注册成功");
				break;
			}{
				System.out.println("验证码错误,请重新输入");
			}
			
		}
		
	}

}
