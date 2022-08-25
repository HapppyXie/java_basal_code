/*循环的嵌套
 * for(;;){      for(;;){}   }
 * 
 * while(){             while(){}      }
 *  
 *  do{              do{}while()  }while()
 *  
 *  for(;;){        while(){}         }
 * 
 * 循环嵌套规则：外层循环每一次循环都要执行一次完整的内层循环
 * 一行20个星号 打印十行     矩形星号
 * 
 * */
public class Task02循环的嵌套 {
	public static void main(String[] args) {
		//外层循环 控制行
		for(int line = 1 ; line <= 10; line++) {
			for(int i = 1 ; i <= 20 ; i++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	

}
