import com.sun.tools.javac.Main;

//有放回值类型
public class Java04function方法应用案例02 {
	public static void main(String[] args) {
		//1.独立语句调用-需要有接受返回值的数据
		/*
		 * int min = getMin(56,78); 
		 * System.out.println(min);
		 */
		//2.作为方法的参数调用-返回的值作为参数值
		
		System.out.println(getMin(56,78));
	}
	
	
	
	/*
	 * 功能：返回两个整数的最小值
	 * 
	 * 
	 * 
	 * */
	public static int getMin(int x,int y) {
		if(x > y) {
			return y;
		}else {
			return x;
		}
		
	}

}
