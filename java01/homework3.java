import java.util.Scanner;

public class homework3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("請輸入半徑");
		//1.輸入半徑
		double r = sc.nextDouble();
		//2運算
		double area = 3.14159256 * r * r;
		//3輸出面積
		System.out.println("該園的面積" + area );
		homework3 h = new homework3();
	//	h.sc.nextDouble();
		
	}

}
