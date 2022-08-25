
public class Huawei implements Phone{
    //华为实现类，实现Phone(继承了Earphone,Usb接口,接口之间的继承),
	//因此要实现Earphone,Usb中的方法
	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Huawei输入方法");
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}
	
	

}
