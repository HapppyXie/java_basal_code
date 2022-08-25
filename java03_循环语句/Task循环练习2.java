/*
 * 
 * º∆À„1+3-5+7-9.....99;
 *  1*1 + 1*3 + (-)*5 + 7 +(-)*9 + 11 ...... +99
 * 
 * 
 * */
public class Task—≠ª∑¡∑œ∞2 {
	public static void main(String[] args) {
		int i = 1;
		int sum1 = 1;
		for(int num = 3 ; num <= 99 ; num += 2) {
			sum1 += i * num;
			i = -i;
		} 
		System.out.println("sum1:" + sum1);
		/*
		 * º∆À„2+4-6+8-10......-100
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		int o = 1;
		int sum2 = 2;
		for(int num = 4; num <= 100; num += 2) {
			sum2 += o * num;
			o = -o;
		}
		System.out.println("sum2:" + sum2);
		
		
	}

}











