import java.util.Scanner;

public class Homework4 {
         public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//請輸入一個整數//
			System.out.println("請輸入一個整數");
			int num = sc.nextInt();
			//運算//
			if(num % 2 == 0) {
				//輸出結果//
				System.out.println("偶數");
			}else {
				System.out.println("奇數");
			}
         
         }
}
