/*continue
 * while(...){..... .... continue继续下一次循环 .....}
 *         意思为 continue前面代码执行 continue后面的代码不执行 并再去判断（）
 * 
 * 打印1-10之间的数，再打印各数的平方和，如果该数是5不要打印
 *  ctrl+/ 注释
 * */
public class Task03循环的continue {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 10 ; i++) {
			if(i == 5) { continue;}
			//i==5时continue省略了后面的代码，进行下次循环
			//结果缺少5，25
            System.out.println(i + "," + i * i);	
           		}

		
	}

}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 