import java.util.Scanner;

/*
 * 
 * 
 * 
 * */
public class Task03方法实现求面积 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("请选择图形：");
		    System.out.println("1.矩形；2.三角形；3.圆；4.退出");
		
		int select = sc.nextInt();
		switch(select) {
		case 1:
			getSquareArea();//方法名：前面一个字母首字母大写，后面字母首字母都小写
			break;
		case 2:
			getTriangleArea();
			break;
		case 3:
			getRoundArea();
			break;
		case 4:
			System.out.println("退出系统");
			System.exit(0);
			default:
				System.out.println("你的选择有误");
		}
		}
	}
	public static void getSquareArea() {
		// TODO Auto-generated method stub
		System.out.println("请输入宽和长：");
		int width = sc.nextInt();
		int length = sc.nextInt();
		System.out.println("矩形面积为：" + width * length);
	}
	public static void getTriangleArea() {
		// TODO Auto-generated method stub
		System.out.println("请输入高：");
		int heigth = sc.nextInt();
		System.out.println("请输入一条边：");
		int side = sc.nextInt();
		System.out.println("三角形面积为：" +   heigth * side / 2);
	}
	public static void getRoundArea() {
		// TODO Auto-generated method stub
		System.out.println("请输入圆的半径：");
		double radius = sc.nextDouble();
		System.out.println("圆的面积为：" + 3.14159256 * radius * radius);
		
	}

}
