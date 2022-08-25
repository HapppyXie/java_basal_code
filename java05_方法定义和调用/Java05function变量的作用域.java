/*
 * 理解变量的作用域
 * 
 * 
 * *
 */
public class Java05function变量的作用域 {
	//1.类变量（全局变量，自定义开始，到类结束）在所有方法外面
	static int a = 10,b = 20;
	
    public static void main(String[] args) {
		//2.方法体内变量（局部变量，从定义开始到本方法结束）
    	int m = 1 , n = 2;
    	f1(m);
    	f2(n);
	}	
    
    public static void f1(int x) {
    	//3.形式参数（局部变量，范围为当前方法内）
    	System.out.println(x);
    }
    
    {
    	
     //4.特殊代码段（局部变量，只有当前大括号内有效）
    	int i = 0,j = 0;
    }
    
    public static void f2(int y) {
		System.out.println(y); 
		/* * System.out.println(x); 
		 * System.out.println(i);   此处系统不法识别x,i
		 */
    	System.out.println(a);  //局部内 全局变量可行，其他局部变量不可识别
    	System.out.println(b);
    }
	

}
