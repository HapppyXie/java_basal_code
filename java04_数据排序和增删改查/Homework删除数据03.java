import java.util.Scanner;

/*  删除数组中的一个数，再按照下标顺序打印数组
 *  原数据：3,6,9,12,34,56
 *  删除索引为2的数
 *  新数据为3，6，12，34,56
 *  
 *  判断哪一个元素 index（下标）
 *  1.  index == 5 删除最后一个元素 不需要移动
 *  2.  index < 5 需要移动
 *   初值 i = index
 *   条件 i <= num.length-2
 *   重复的操作 num[i] = num[i+1]
 *   
 * */
public class Homework删除数据03 {
	public static void main(String[] args) {
		int [] num = {3,6,9,12,34,56};
		System.out.println("初始数据：");
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("------------------");
		//删除一个数据=让其后面的数往前走，将其覆盖 num[i] = num [i+1]
		// 覆盖到num[num.length-2]=num[num.length-1] 即可; 
		// 最后让num[num.length-1]=0 
		
		System.out.println("帮助删除的下标");
		//打印帮助删除的小标
		for(int l = 0 ;l <num.length ; l++) {
			System.out.print(l+"  ");
		}
		System.out.println();
		System.out.println("------------------");
		
		
		
		
		 Scanner sc = new Scanner(System.in);
		 //删除元素
		 System.out.println("请输入要删除元素的索引：");
		 int index = sc.nextInt();
		  if(index == num.length-1) {
			  num[num.length-1] = 0;
		  }else {
			  for(int k = index ; k < num.length-1 ; k++) {
				  num[k] = num[k+1];
			  }
			  num[num.length-1] = 0;
		  }
		 //删除索引后的数组
		  System.out.println("----------------");
		  for(int y = 0 ; y < num.length ; y++) {
			  System.out.print(num[y]+" ");
		  }
	       
		 
	}

}
