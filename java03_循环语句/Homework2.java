/*打印出100-200之间的所有素数，每5个换行
 * 外层循环  初值 int num 100   条件  num <= 200 
 * 循环语句: 判断num是否为素数 
 *          打印素数 
 *          每5个换行
 * 
 * 
 * 
 * */
public class Homework2 {
	public static void main(String[] args) {
		int count = 0;
	  for(int num = 100 ; num <= 200 ; num++) {
		  for(int i = 2 ; i < num ; i++) {
			  //判断num是不是素数,
	 //此程序存在漏洞,外循环每次取出的数，先被2除,如果不可以被2整除就输出,忽略了被5，6等等
			         if(num % i != 0) {  			
			        		 System.out.print(num + " ");   
				               count++; 
				               if(count % 5 == 0) {
				            	   System.out.println();				            
			        	}     
			             }
			break;
		}
	  }
	}
}

