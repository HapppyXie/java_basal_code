import java.util.Arrays;
import java.util.Scanner;

/*
 * 方法实现再数组中查找某个数放回索引
 * 
 * */
public class Homework02方法实现数组中查找某个数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = {23,45,7,23,56,78,124,79,90};
		System.out.println(Arrays.toString(num));
		System.out.println("请输入要查找的数：");
		int input = sc.nextInt();
		int index = getIndex(num,input);
		if(index == -1) {
			System.out.println("没有找到该数");
		}else {
			System.out.println("该数的索引为："+index);
		}
		
	}
	/*在数组中查找某个数返回索引
	 *  数组 arr
	 *  索引 num
	 *  没有找到 返回 -1
	 * 
	 * 
	 * 
	 * */
	public static int getIndex(int[] arr,int date) {
		int index = -1;
		for(int i = 0 ; i < arr.length ; i++) {
			if(date == arr[i]) {
				index = i;
				break;
			}
		}
		return index;//方法未写完可使用return 0;先规避错误
	}
	

}
