import java.util.Scanner;

public class Homework5 {
         public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入一個四位數,即可得出其千，百，十，个位");
			int num = sc.nextInt();
			//輸入一個四位數屬//
			//運算//
	int thu = num / 1000;// /号 只会得出计算后的整位
	int hun = num % 1000 / 100; //%只会得出计算后的余位
	int ten = num % 100 / 10;
	int sig = num % 10;
			//輸出結果//
			System.out.println("千位："+ thu);
			System.out.println("百位："+ hun);
			System.out.println("十位："+ ten);
			System.out.println("個位："+ sig);

			
		}
}
