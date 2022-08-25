import java.util.Scanner;

/*
 * 四个整数求最值
 * 两两比较，前两个比较得出最大值num1
 *        后两个比较得出最大值num2  num1再和num2比较
 * 
 * 
 * */
public class Java01function {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入四个整数：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		// 先比较前两个数 
		int max1 = 0;
		int max2 = 0;
		int max =0;
		//定义最大值
		/*
		 * if(num1 > num2) { max1 = num1; }else { max1 = num2; } 
		 * if(num3 > num4) { max =
		 * num3; }else { max = num4; } 
		 * if(max1 > max2) { max = max1; }else { max = max2;
		 * }
		 */ //方法调用
		max1 = getMax(num1,num2);
		max2 = getMax(num3,num4);
		max = getMax(max1,max2);
		System.out.println("最大值为："+ max); }
		//利用这种分支结构，if判断好理解，繁琐
/*
 *  所以有获取最大值的方法
 *  x 为第一个数 y为第二个数
 *  return x和y的最大值
 * 
 * 
 * */  //方法定义
		public static int getMax(int x ,int y) {
			if(x > y) {
				return x;
			}else {
				return y;
			}		
		
	
}
}  
