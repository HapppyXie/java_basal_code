import java.util.Scanner;

/*
 * 数组元素逆序  中心思想：通过索引，进行交换
 * 
 * 
 * */
public class Homework数组逆序01 {
	public static void main(String[] args) {
		System.out.println("请输入10个数据");
		int [] num = new int[10];
		Scanner sc = new Scanner(System.in);
		//输入初始数据
		for(int i = 0; i < num.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数据");
			num [i] = sc.nextInt();
		}
		//打印初始数据
        for(int t = 0; t < num.length; t++) {
        	System.out.print(num[t]+" ");
        }
        //换行
        System.out.println();
        System.out.println("-----------");
        // 数组有0到数组length-1   即0-num，length-1
        int temp = 0;
         for(int j = 0 ; j < num.length/2 ; j++) {
        	 temp = num[j];
        	 num[j] = num[num.length-j-1];
        	 num[num.length-j-1] = temp;
         }
         //打印逆序数组
         for(int k = 0 ; k < num.length ; k++) {
        	 System.out.print(num[k]+" ");
         }
         
	}

}
