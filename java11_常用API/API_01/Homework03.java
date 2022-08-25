package API快速入门1;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		//输入出生年份计算年龄，要求对年份进行验证
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生年份");
		String regex = "^[1|2][0-9]{3}$";
		String birth = sc.next();
		int age;
		int birth1 = Integer.parseInt(birth);
		if(!birth.matches(regex)) {
			System.out.println("数据格式错误");
			continue;
		}else {
			age = 2022-birth1;
			System.out.println(age);
		}
		
	}
	}

}
