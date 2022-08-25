import java.util.Scanner;

/*
 * 方法实现升序，降序
 * 
 * */
public class Task01方法实现排序 {
	public static void main(String[] args) {
		int [] num = {87,68,94,85,59,33,83,75,82,52};
		//打印初始数据
		printArray(num);
		System.out.println();
		System.out.println("-------------------");
		System.out.println("请选择排序方法：");
		System.out.println("1.升序；2.降序.3退出系统");
		Scanner sc = new Scanner(System.in);
		 int method = sc.nextInt();
		 if(method == 1) {
			 f1(num);
		 }else if(method == 2) {
			 f2(num);
		 }else if(method == 3) {
			 System.out.println("退出系统");
		 }else {
			 System.out.println("无法识别选项，请重新输入");
		 }
		 
 
	}
	
	
	
	
	
	//定义排序方法  此次升序
	public static void f1(int [] arr) {
		int [] num = {87,68,94,85,59,33,83,75,82,52};
		int temp = 0;
		for(int j = 0 ; j < num.length-1 ; j++) {
			for(int g = 0 ; g < num.length-1-j ; g++) {
				if(num[g] > num[g+1]) {
					temp = num[g];
					num[g] = num [g+1];
					num[g+1] = temp;
				
				}
			}
		}
		for(int h = 0 ; h < num.length ; h++) {
			System.out.print(num[h] + " ");
		}
	}
	
	//此次为降序
	public static void f2(int [] arr) {
		int temp = 0;
		for(int j = 0 ; j < arr.length-1 ; j++) {
			for(int g = 0 ; g < arr.length-1-j ; g++) {
				if(arr[g] < arr[g+1]) {
				   temp = arr[g+1];
				   arr[g+1] = arr[g];
				   arr[g] = temp;
				}
			}
		}
		//for(int h = 0 ; h < num.length ; h++) {
		//	System.out.print(num[h] + " ");
	//}   此处调用打印方法
		printArray(arr);
	
	
	}
	
	//设置一个打印数组的方法
	public static void printArray(int [] arr) {
			
			for(int h = 0 ; h < arr.length ; h++) {
			System.out.print(arr [h] + " ");
	}
	
	
	
	
	}
	}
