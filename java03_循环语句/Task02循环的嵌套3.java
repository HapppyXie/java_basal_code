/*打印三角形星号
 * 外层控制循环
 * 1.打印空格
 * 2打印星号
 * 3打印空格 x 不需要 此时后面空格不要也行
 * 4换行
 *   行数  星号  空格
 *   1     1    3
 *   2     3    2
 *   3     5    1
 *   4     7    0
 *                   行数 + 空格数 = 4
 *                   空格数 = 4 - 行数
 *                   星号数 = 行数 * 2 - 1
 * 
 * 
 * 
 * */
public class Task02循环的嵌套3 {
	
	public static void main(String[] args) {

		for (int line = 1; line <= 4; line++) {

			for (int k = 1; k <= 4 - line; k++) {
				System.out.print(" ");
			}

			for (int i = 1; i <= line * 2 - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int q = 6;
		//控制行
		for(int line = 1 ; line <= 4 ; line++) {
			//控制空格
			for(int k = 1 ; k <= line-1 ; k++) {
				System.out.print(" ");
			}
			//控制星号
			   for(int i = 0 ; i <= q  ; i++) {
				   
				   System.out.print("*");
			   }
			   q -= 2;// 即是q=q-2;
			   System.out.println();
		}


	}
}
