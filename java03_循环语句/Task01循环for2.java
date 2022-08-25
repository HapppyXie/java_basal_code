/*
 * 运用for结构计算1+2+3....+100
 * 
 * 
 * 
 * 
 * */
public class Task01循环for2 {
	public static void main(String[] args) {
		int sum1 = 0;
		for(int num = 1; num <= 100 ; num++) {
			sum1 += num;
		}
		System.out.println("sum1:" + sum1);
		
		int sum3 = 0;
		int sum2 = 0;
		for(int num = 3 ; num <= 300 ; num+=3 ) {
			sum2 += num;
		}
		System.out.println("sum2:"+sum2);
		
		sum3 = sum1 + sum2;
		
		System.out.println("sum3:"+sum3);
		
		
		
	}

}
