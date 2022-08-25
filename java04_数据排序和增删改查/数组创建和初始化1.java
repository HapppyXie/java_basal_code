/*
 * 数组代表一组数 实现对一组数据的管理  求和 排序
 *   数组定义好 长度不可改变
 * 
 * */
public class 数组创建和初始化1 {
	public static void main(String[] args) {
		//方式1：通过new的方式分配空间   先分配空间再使用
		int [] score = new int[10];//score为数组名,表示这个数组的首地址，数据类型为int，空间为10
		 System.out.println(score[0]);
		 System.out.println(score[9]);
		//score[0] = 80;   如果没有赋初值，数值类型会赋初值为0
		//score[1] = 78;
		//或 先定义，再分配
		/* int[] score;
		 * score = new int[10];
		 * 
		 * 
		 */
		 //方式2：通过赋初值的方式分配存贮空间
		 int [] goal = {80,84,70,86,65,45};   //按照数据存贮单元进行赋值  
		System.out.println(goal[2]);  //从0开始索引 声明数组的时候对数组进行初始化，按照数组存贮单元的顺序赋值
		                               //数组的长度就是初始化数据的个数
		                               // int [] goal = {87,20,32,,5,65} 错误
	    //如果是引用类型（如字符串）会赋初值为null
		String [] name = new String[10];
		System.out.println(name[9]); //输出的长度要比定义的小于1，因为其从0开始索引
		System.out.println(name[name.length-1]);
		System.out.println(name[0]);
		
		//如果是布尔类型boolean会赋初值为false
		boolean [] dog = new boolean[10];
		System.out.println(dog[9]);
        System.out.println(dog[10]);	//数组越界异常
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
