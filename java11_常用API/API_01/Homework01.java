package API快速入门1;

import java.util.Scanner;


/*
 * 正则表达式应用案例
 * 1.手机号登录验证  
 * 任务需求：某系统登录需要输入手机号和验证码
 * 		1.手机号必须是11位数字，开头数字为1
 * 		2.短信验证码必须是6位数字
 * 
 * 2.正则表达式
 * 
 * */
public class Homework01 {
/*
 * 任务需求：某系统登录需要输入手机号和验证码
 * 		1.手机号必须是11位数字，开头数字为1
 * 		2.短信验证码必须是6位数字
 * 		先使用原生API
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("进入登录系统：");
		String phone = "";
		String code ="";
		while(true) {
			System.out.println("13428334846-示例");
			System.out.println("请输入手机号：");
			phone = sc.next();
			
//			if(phone.length() != 11) {
//				System.out.println("手机号应为11位数字！");
//				continue;
//			}
//			if(phone.charAt(0) != '1') {
//				System.out.println("手机号第一位应为1！");
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
//				System.out.println("手机号码必须全是数字!");
//				continue;
//			}
			
			//这样写繁琐，出现正则表达式
		/*
		 * String类的一个方法
			 * 			public boolean matches(String regex)
			 * 			告知此字符串是否匹配给定的正则表达式regex
			 * 			匹配正确时返回true,匹配错误时返回false
			 * */
					String regex = "^1[0-9]{10}$";
					if(phone.matches(regex)) {
						System.out.println("符合手机号码格式！");
					}else {
						System.out.println("不符合手机号码格式!");
						continue;
					}
			break;
		}
		while(true) {
			System.out.println("请输入验证码：");
			System.out.println("123456-示例");
			code = sc.next();
			String regex = "^[0-9]{6}$";
			if(code.matches(regex)) {
				System.out.println("验证码格式符合要求！");
			}else {
				System.out.println("验证码不符合格式要求！");
				continue;
			}
			break;
		}
		System.out.println("登录成功！");
		
		
	}
}
