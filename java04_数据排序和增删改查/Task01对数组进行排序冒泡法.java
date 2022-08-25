/*
 * 对数组进行排序 冒泡法 选择法
 * 
 * 冒泡法 1.控制冒泡次数，冒泡次数比数组实际个数少1
 *      2.控制比较次数，每次冒泡比较次数少1
 *      3.相邻的两个数进行比较，根据升序降序进行数据交换，引入第三者
 * 
 * */
public class Task01对数组进行排序冒泡法 {
	public static void main(String[] args) {
		int[] array = {9,8,14,0,2,5,89,4,2,7};
		//先打印初始数据
		for(int s = 0 ; s < array.length ; s++) {
			System.out.print(array[s]+",");
		}
		System.out.println();
		System.out.println("------------");
		//控制起泡循环次数比数组个数小于1    array.length=10
		int temp = 0;
		for(int i = 0 ; i < array.length-1 ; i++) {
			//控制每次起泡进行比较的循环的次数  起一次泡 比较次数少-（1-i）
			for(int j = 0 ; j < array.length-1-i ; j++) {
			   //相邻的两个数比较交换，根据升序还是降序 此处升序
				if(array[j] > array[j+1]) {
					//交换位置 引进第三者 注意程序顺序
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
		      }
		   }
		//       打印排序后的数据
		for(int k = 0 ; k < array.length ; k++) {
			System.out.print(array[k]+",");
		}
		
		
		
		//   
		for(int i = 0 ; i < array.length-1 ; i++) {
			//控制每次起泡进行比较的循环的次数  起一次泡 比较次数少-（1-i）
			for(int j = 0 ; j < array.length-1-i ; j++) {
			   //相邻的两个数比较交换，根据升序还是降序 此处降序
				if(array[j] < array[j+1]) {
					//交换位置 引进第三者 注意程序顺序
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
		
				}
			}
		}
		System.out.println();
		System.out.println("------------");
		for(int s = 0 ; s < array.length ; s++) {
			System.out.print(array[s]+",");
		}
	}}

