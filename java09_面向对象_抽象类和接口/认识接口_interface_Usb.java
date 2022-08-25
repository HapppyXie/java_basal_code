
public interface 认识接口_interface_Usb {
	//	 接口（interface）:当一个类所有的方法都是抽象方法时，该类可转成接口
/*       例子 1.Udisk-usb-TestUsb       2.Product-ProductService-ProductServiceimpl
 * 
 * 接口的目的：做项目的顶层设计，通常制定标准和规范-项目中通常先设计业务接口
 * 			实现类实现接口必须实现接口的所有方法-实现类方法和接口方法一致
 * 
 * 
 * 接口特征：所有方法都是抽象的
 * 		  方法默认是public abstract类型   抽象方法只能供子类实现
 * 									  子类必须能够访问到
 *  	  属性默认是public static final类型   define PI 3.14
 * 
 * 
 *对接口的进一步讨论： 解决Java类单一继承问题：接口可以多继承(继承多个父类接口，组合)  例子：phone接口设计 Phone-Earphone-Usb,Huawei，Vivo实现  
 *				 多态的另一种体现：重写Override：子类和父类的实现不同
 *							  重载Overload：一个类中同名方法的不同实现
 *							  接口：不同的实现类有不同的实现方法
 *				 可通过接口实现解耦： 上转型思想：子类对象可以赋给父类对象
 *								          父类类型可以接受不同的子类对象
 *								 接口可以接受所有实现类
 *								 示例代码： 灯接口Light
 *										 红灯RedLight实现light
 * 										 绿灯GreenLight实现Light
 * 										 灯控制器类LightControl
 * 										 测试类TestLight
 * 
 * */
	//输入
	public void input();
	//抽象类中的方法没有{}方法体
	//输出
	public void ouput();
	
	//充电
	public void charge();


}
