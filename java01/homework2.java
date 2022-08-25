import java.util.Scanner;

//任務1//任意輸入兩個數的和差積商
public class homework2 {
     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           //1輸入數據
           System.out.println("請輸入兩個數：");
           double num1 = sc.nextDouble();
           double num2 = sc.nextDouble();
           //2運算
			double sum = num1 + num2;
			double difference = num1 - num2;
			double product = num1 * num2;
			double quotient = num1 / num2;
			//3輸出結果
			System.out.println("和："+ sum);
			System.out.println("差："+ difference);
			System.out.println("積："+ product);
			System.out.println("商："+ quotient);
				 
				 
	}
}
