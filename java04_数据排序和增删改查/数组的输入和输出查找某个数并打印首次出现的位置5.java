import java.util.Scanner;

/*
 * 
 * 
 * 
 * */
public class 数组的输入和输出查找某个数并打印首次出现的位置5 {
	public static void main(String[] args) {
		int [] num = {55,45,87,65,12,36,78,45,65};//注意 此处数字有重复 只要第一个即可
		for(int i  = 0 ; i < num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("请输入要查找的数");
		Scanner sc = new Scanner(System.in);
		int serach = sc.nextInt();
		int index = -1;
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i] == serach) {
				  index = i;
				  break;
			}
		}
		System.out.println("["+ index+"]"); //注意为打印位置，而不是数字
	}

}
