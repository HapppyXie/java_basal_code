import java.util.Scanner;

/*
 * 
 * 找到最大值和最小值
 *  
 *  定义最大和最小值为一个新的变量，一次比较，赋最大的值给新变量
 * 
 * */
public class 数组的输入和输出3查找最大值和最小值4 {
	public static void main(String[] args) {
		int [] score = {54,89,45,87,98,45,99};
		int max = score[0]; //假定第一个值为最大值
		int min = score[0]; //假定第一个值也是最小值
		 for(int i = 1 ; i < 7 ; i++) {
			 if(score[i] > max) {
				 max = score[i];  }
				 if(score[i] < min) {
					 min = score[i];
				 }
			 
		 }
		 double sum = 0;
		 System.out.println("最大值为：" + max);
		 System.out.println("最小值为：" + min);
		 
		 for(int j = 0 ; j < score.length ; j++) {
			  sum += score[j];
		 }
		 System.out.println("去掉最大值和最小值后的平均值为：" + (sum - max -min) / 5);
		 
		 
		 
		
	}

}
