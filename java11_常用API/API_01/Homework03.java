package API��������1;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		//���������ݼ������䣬Ҫ�����ݽ�����֤
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		String regex = "^[1|2][0-9]{3}$";
		String birth = sc.next();
		int age;
		int birth1 = Integer.parseInt(birth);
		if(!birth.matches(regex)) {
			System.out.println("���ݸ�ʽ����");
			continue;
		}else {
			age = 2022-birth1;
			System.out.println(age);
		}
		
	}
	}

}
