package API快速入门2;

import java.math.BigDecimal;

/*
 * Math数学运算 指数，对数，平方根法，三角函数等
 * 		属性和方法全部都是static类型 使用类名直接调用		类名.属性  类名.方法
 * 
 * BigDecimal 小数的精确运算，可指定小数点后的位数 加减乘除
 * 		
 * 			主要用途：精确运算
 * 
 * */

public class Task01数学相关类01 {
	public static void main(String[] args) {
		System.out.println(Math.max(98, 20));
		System.out.println(Math.sqrt(99));
		
		BigDecimal bd1 = new BigDecimal("3.14");
		BigDecimal bd2 = new BigDecimal("2.15");
		BigDecimal result = null;
		//加add
		result = bd1.add(bd2);
		System.out.println(result);
		//减
		result = bd1.subtract(bd2);
		//乘
		result = bd1.multiply(bd2);
		//除
		result = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);//(除数，精度，四舍五入)
		System.out.println(result);
		
		//设置精度  对象.setScale(小数位数，BigDecimal.ROUND_HALF_UP);
		System.out.println(result.setScale(5,BigDecimal.ROUND_HALF_UP));
		
		System.out.println("-----------");
		//不精确运算,无法控制后面有多少位
		double d1 = 3.14;
		double d2 = 2.15;
		double result1 = d1/d2;
		System.out.println(result1);
		
		
		
		
	}

}
