/*计算分数数列 2/1  3/2   5/3  8/5 13/8 21/13  前20项之和
 * 
 *   后一个数的分母是前一个数的分子  后一个数的分子是前一个数的分子和分母之和
 *
 * 
 * */
public class Homework1 {
	public static void main(String[] args) {
		double i = 2;
		double p = 1;
		double sum = 0;
		double temp = 0;
		for(int count = 1 ; count <= 20 ; count++) {
			sum += i / p;
			temp = i;
			i = i + p;
			p = temp; 
		}
		System.out.println("sum:" + sum);
	}

}
