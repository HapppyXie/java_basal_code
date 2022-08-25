/*
 * do{   循环语句}while(   循环条件)；
 * 
 * 先做在判断  至少执行一次的情况
 * 
 * 
 * */
public class Task01循环dowhile {
	public static void main(String[] args) {
		int count = 1;
		int num = 1;
		do{//循环体
			System.out.println("完成课后任务");
			if(count==1) {
				System.out.println("-----------");
			}
			count++;
			}while( count <= 3);//循环语句
		
		while(num <= 3) {
			System.out.println("我爱学习");
			num++;
			
		}

	}
}
