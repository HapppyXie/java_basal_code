/*
 * u盘实现接口（implements）
 * 
 * 
 * 
 * */
public class Udisk implements Usb{
//子类继承接口（即实现接口），要对接口中的抽线方法做具体实现
					//可增加方法，但原有的接口中的方法必须实现，通常不增加
	//项目中业务实现通常先设计业务接口
	// 事例：商品管理业务接口   
	//Product   写完商品类后，可new一个interface  第一次没有出现，找other 在里面打interface
	//                    得到一个ProductService
	
	
	@Override
	public void input() {
		System.out.println("Udisk输入方法");
		
	}

	@Override
	public void output() {
		System.out.println("Udisk输出方法");
	}

	@Override
	public void charge() {
		System.out.println("Udisk充电方法");
	}
	
	

}
