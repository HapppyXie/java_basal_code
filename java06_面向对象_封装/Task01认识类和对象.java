/*
 * 软件产品的目的是解决某一特定问题 电商（外卖）
 *  管理店铺，商品类别，商品，用户，订单等信息
 *  商品：编号，名称，类别，图片，单价，库存，描述
 *  店铺：店铺名称，店铺地址，联系电话
 *  用户：账户，密码，昵称，电话，送货地址
 * 
 * 问题：单一的基本类型不能满足数据的存储 byte short int long char float double boolean
 *  数组可以存储多个数，但只能储存同一种数据类型
 *  
 *  解决问题来了:造类型 例如：Product类型 public class Product{   }
 *     认识类   类-根据特定要求（要管理那些数据）创建新的类型type 
 *     认识对象       对象-对新的创建类型定义的变量
 *         创建对象：Product p1 = new Product();//创建对象-给对象开辟存储空间
 *         new的含义:依据当前的类型，将类型中包含的数据开辟相应的存储空间
 *                 new 构造方法() - 创建对象
 *                 变量p1 , java中称为对象  java中有栈内存，堆内存 对象存储在栈内存中
 *                 对象存储图例
 *                 说明
 *   构造方法：创建的类默认会有一个无参的构造方法 public Product() {
 *                                                             }
 *                                     为对象开辟存储空间
 *                                     给属性赋默认值-数值类型为0
 *                                                引用类型为null
 *                                                和数组的默认值相同
 *                                                
 *                                                
 *                                                
 *           可以人为添加有参构造-添加有参构造后会覆盖默认的无参构造
 *                           为对象开辟存储空间
 *                           创建对象时依据参数给当前对象属性赋值
 *    this:指代被创建的对象本身
 *    
 * */
public class Task01认识类和对象 {
	public static void main(String[] args) {
		int num;  //定义了一个 int 类型的num
		Product p4 = new Product();// 通过造类型 ，此处定义了一个Product类型的变量 p1
		Shop shop1;//此处告诉程序shop1是Shop类型的数据，还没有初始化
		User user1;
		
		//p4.productId = 5;//此处不能直接赋值，因为这是我们自己开辟的类，还没有分配存储空间 得告诉计算机开辟存储空间
		p4.setProductId(5);
        p4.setProductName("过桥米线");
		
//		System.out.println(p1);//打印出来的是p1（对象）存储在栈内存里的东西-Product@123a439b-而这个地址指的是堆内存里的
		                           //  productId;productName;productType;......
		System.out.println(p4.getProductId());
		System.out.println(p4.getProductName());
		System.out.println("---------------------");
		//再重新定义一个变量
		Product p2 = new Product();
//		System.out.println(p2.productId);//此处为演示没有对属性private时，在没有赋值时，打印出来的初始值
//		System.out.println(p2.productName);
//		System.out.println(p2);
//		Product p3 = p2;
//         System.out.println(p3);
		System.out.println("----------------------");
		//此为有参构造
		Product p3 = new Product(3 , "煎饼果子" , "小吃" , 8 , 100 , "特别特别好吃不贵，适合早餐，夜宵食用");
		System.out.println(p3.getProductDescribtion());
		
	}
	/*
	 * 类的命名规范：UpperGamelCase 大骆驼命名法
	 *   首字母大写
	 *   类的成员(对象)，变量名，方法名：lowerCamelCase 小骆驼命名法
	 * 
	 * */

}
