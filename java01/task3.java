
public class task3 {
	public static void main(String[] args) {
	//	int a = 11;
	 //int b = 12;
		//System.out.println(!(a>b)); //!非
	//	System.out.println((a != b) && (a > b)); //&&與
		//System.out.println(!(a > b) || (a != b));//||或 
		int a = 10;int b = 20;int c = 30;int d = 40;
		if(a++<b || c++>d) {
			System.out.println(a+","+b+","+c+","+d);  
			//惰性求值，第一個條件爲真，已滿足，第二個忽略//
		}
		if(++a>b && ++c>d) {  
			System.out.println(a+","+b+","+c+","+d);
		}//if(++a)也执行
		System.out.println(a+","+b+","+c+","+d);
	
		
	}
}
