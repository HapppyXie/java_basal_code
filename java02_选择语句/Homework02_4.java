import java.util.Scanner;

//求面积系统
public class Homework02_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("请选择图形：1矩形 2三角形 3圆");
		 //选择图形
		 double shape = sc.nextDouble();
		  if(shape == 1) {
			  System.out.println("请输入长和宽");
			  double length = sc.nextDouble();
			  double breath = sc.nextDouble();
			  System.out.println("面积："+ length * breath);
		  }else if(shape == 2) {
			  System.out.println("请输入一条边和高");
			  double side = sc.nextDouble();
			  double heigth =sc.nextDouble();
			  System.out.println("面积："+ 0.5 * side * heigth);
		  }else if(shape == 3) {
			  System.out.println("请输入半径");
			  double r = sc.nextDouble();
			  double i = 3.14159256;
			  System.out.println("面积："+ i * r * r);
		  }else {
		  System.out.println("输入错误，请重新输入");
		  }
	}
		    
	}
}
