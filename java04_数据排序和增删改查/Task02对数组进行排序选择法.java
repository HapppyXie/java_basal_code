/*
 * 选择法
 * 1.控制所拿数组要中后面要比较的数-拿到倒数第二个数
 * 2.控制比较的是所拿数的后面所有数-i+1到length-1
 * 3.所拿数i和后面所有数j进行比较
 * 
 * */
public class Task02对数组进行排序选择法 {
	public static void main(String[] args) {
	    //控制所拿数组中要进行比较的数
		int[] array = {9,8,14,0,2,5,87,34,25};//array.length=9
		//打印初始数据
		for(int a = 0 ; a < array.length ; a++) {
			System.out.print(array[a]+",");
		}
		int temp = 0;
		//对数组进行排序  控制数组要进行比较的数0——array.lengt-1
		//   此处 i <= array.length-2 
		for(int i = 0 ; i < array.length-1 ; i++) {
			for(int j = i+1 ; j < array.length ; j++) {
				 //拿到的数和后面所有的数进行比较 
				//array[i]和 array[j]=array[i+1] 进行比较 
				//根据升序和降序       //改变大于小于号即可改变升降序
				if(array[i] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
				
				 
			}
		}
		//换行
		System.out.println();
		System.out.println("------------");
		//打印排序后的数组
		for(int s = 0 ; s < array.length ; s++) {
			System.out.print(array[s]+",");
		}
		
	}

}
