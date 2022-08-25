package API快速入门2;

import java.util.Random;

public class Homework01模拟验证码 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		char[] ch = {'0','1','2','3','4','5','6','7','8','9'};
		Random r = new Random();
		for(int i = 0; i < 5; i++) {
			char num = ch[r.nextInt(ch.length)];
			str.append(num);
		}
		System.out.println(str.toString());
	}

}
