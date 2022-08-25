import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
	while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入成績：");
		System.out.println("成绩介于0-100之间");
		int score = sc.nextInt();
		if(100 >= score && score >= 90) {
			System.out.println("A");
			System.out.println("你牛逼！");
		}else if(score >= 80){
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else if(score >= 0){
			System.out.println("E");
			System.out.println("不及格，试卷叫家长签字");
		}else {
			System.out.println("输入成绩不符合考试科目规定");
			System.out.println("请重新输入");
		}
		
	}
	}

}
