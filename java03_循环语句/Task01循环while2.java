/*
 * 
 * 计算循环的1+2.....+100
 * 循环初值  int num = 1
 * 循环条件 num <=100
 * 重复做的事情 
 * int sum = 0;
 * sum += num;
 * num++;
 * 
 * 
 * 
 * 
 * */
public class Task01循环while2 {
	public static void main(String[] args) {
		 int num = 1;
		 int sum = 0;//定义初始值
		 while(num <= 100) {
			 sum += num;//把和加给sum
			 num++;//每次num加1
		 }
		 System.out.println("sum=" + sum);
		 
		 
		
		
		
	}
	

}
