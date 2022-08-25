/*
 * 
 * 打印平行四边形星号
 * 外层控制10行
 * 1.打印空格 
 * 2.内层循环  打印20个星号 
 * 3.换行
 *    行     空格    星号
 *    1      0      20
 *    2      1      20
 *    3      2      20
 *    4      3      20    行数-1=空格数
 * 
 * 
 * 
 * */
public class Task02循环的嵌套2 {
	public static void main(String[] args) {
		//外层循环 控制10行
		for(int i = 1 ; i <= 10 ; i++) {
			//控制空格
				for(int k = 1 ; k <= i - 1 ;k++) {
					System.out.print(" ");
				}
				//控制星号
				for(int j = 1 ; j <= 20 ; j++) {
					System.out.print("*");

				}

				//换行
			System.out.println();
			
		}
		
		//外层控制行 
		for(int i = 1 ; i <= 10 ; i++) {
			//控制空格
			for(int k = 1 ; k <= 10-i ; k++) {
				System.out.print(" ");
			}
			//控制星号
			for(int j = 1 ; j <= 20 ; j++) {
				System.out.print("*");
			}
			System.out.println();	
			
		
		}
		
	
		}

}
