/*打印99乘法表
 *  行数  列数
 *  1     1
 *  2     2
 *  3     3
 *  .......         行数=列数       i=j
 * 
 * */
public class Homework4 {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j + "*" + i + "=" + i * j + " " );
			}
			System.out.println();
			}
	}

}
