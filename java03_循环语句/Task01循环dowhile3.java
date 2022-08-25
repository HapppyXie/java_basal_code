/*计算1+2+3.....+100=sum
 *   在前面的基础上 sum + 2 +4+6.......+200
 * 初值
 * 循环语句
 * 循环条件
 * 
 * 
 * */
public class Task01循环dowhile3 {
	public static void main(String[] args) {
		int num = 1;
		int num2 = 0;
		int sum = 0;
		int sum2 = 0;
		do {
			sum += num;
			num++;
		}while(num <= 100);
		System.out.println("sum:" + sum);
		System.out.println("----------------");
		
		int sum3 = 0;//作为最终接受
		do {
			sum2 += num2;
			num2 += 2;
		
		}while(num2 <= 200);
		
		
		sum3 = sum + sum2;
		System.out.println("sum3:" + sum3);
	}

}
