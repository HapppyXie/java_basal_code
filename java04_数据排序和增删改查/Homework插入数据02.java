import java.util.Scanner;

/*
 * 
 * 插入一个数据(要求原来数据有序)，使数组仍保持有序
 * 
 * int [] num = {3,6,9,12,34,0} 此处设置0为后面的插入准备一个空间
 *  插入的数据源：int input = 0;
 *   1.input <= num[0];  数组所有元素后移
 *   2.intput >= num[num.length-2] 直接放到最后一个位置
 *   3.intput > num[i] && intput < num[i+1] 数组元素从i+1之后后移
 *    
 * * */
public class Homework插入数据02 {
	public static void main(String[] args) {
		// 输入初始数据
		int[] num = {3,6,9,12,34,0};  
		//此处的0 可使用num.length-1省略 ?,不可此时num还未创建完毕
		//打印初始数据
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("请输入要插入的数据：");
		System.out.println("--------------");

		//插入数据
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input <= num[0]) {
			//放在第一位，所有元素后移，先从最后一个后移
			//先后退，再赋值，以免覆盖
			for(int j = num.length-2 ; j >= 0 ; j--) {
				num[j+1] = num[j];
			}
			num[0] = input;
			
		}else if(input >= num[num.length-2]) {
			//放在最后一位
			num[num.length-1] = input;
		}else {
			//放在中间
			int flag = 0 ;
		   for(int p = 0 ; p < num.length ; p++) {
			   if(input >= num[p] && input <= num[p+1]) {
					//找到位置后从p+1开始后移数据 并在p+1处插入数据
				   flag = p+1;
				   break;
			   }
		   }
	
			for(int g = num.length-2 ; g >= flag ; g--) {
				num[g+1] = num[g];
			}
			num[flag] = input;
		}
		//输出插入数据后的数组
		System.out.println("--------------");
		for(int w = 0 ; w < num.length ; w++) {
			System.out.print(num[w]+" ");
		}
	
	}

}
