
/*
 * 打印斐波那数列前50个，每10个换行
 * 1 1 2 3 5 8 13 21......，第三个数是前两个数的和
 * 
 * 
 * 
 * */
public class Task循环练习3 {
	public static void main(String[] args) {
		long f1 = 1;   //后面出现负值 数据超过了int的数据范围
		long f2 = 1;
		System.out.print(f1 + "," + f2+",");//后面加上+"," 去掉ln 打印变成横行
		long f3 = 0;
		int count = 2;
		 while(count <= 50) {
			 f3 = f1 + f2;
			 System.out.print(f3+",");			 
			 count++;
			 if(count % 10 == 0) {
				 System.out.println();//打印字符的()为空即是换行
			 }        
			 f1 = f2;
			 f2 = f3;        
		 }
		 System.out.println();
		 System.out.println("------------------");
		 //打印斐波那数列前50个，每10个换行
		//1 1 2 3 5 8 13 21......，第三个数是前两个数的和
          long l1 = 1;
          long l2 = 1;
          long l3 = 0;
          System.out.print(l1 + "," + l2 + ",");
		 
          for(int i = 2 ; i <= 50 ; ) {
        	  l3 = l1+l2;
        	  System.out.print(l3+",");
        	  i++;
        	  l1=l2;
        	  l2=l3;
        	  if(i%10==0) {//诺i++写在()中，因为先输出，判断，再i++
        		           //而不是 先输出 i++ 再判断 会导致1行有11个数
        		  System.out.println();
        	  }
          }
		 
		}
	}


