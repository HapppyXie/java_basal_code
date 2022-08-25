package Homework2继承和多态;

public class Test {
	public static void main(String[] args) {
		//测试父类  
		//无参构造测试
		Phone p1 = new Phone();
		p1.setType("苹果8");
		p1.setColor("黑色");
		p1.setPrice(2000);
		System.out.println(p1);
		
		//测试有参构造
		Phone p2 = new Phone("苹果8s","白色",2400);
		System.out.println(p2);
		//测试 打电话 ，短信 ，语音方法
		p2.call("13428394849");
		p2.sendMessage("13428394849", "记得吃饭");
		p2.sendMessage("13428394849", 9);//发了9秒的语音
		
		//子类1测试
		//无参测试
		Son1HuaWei h1 = new Son1HuaWei();
		h1.setType("荣耀");
		h1.setColor("银色");
		h1.setPrice(3000);
		System.out.println(h1);
		h1.call("阿旺");
		
		//子类2测试
		Son2Vivo v1 = new Son2Vivo();
		v1.setType("x30");
		v1.setColor("白色");
		v1.setPrice(2600);
		System.out.println(v1);
		v1.getPhoto("阿旺");
		v1.play("王者荣耀");
		
		Phone v2 = new Son2Vivo();//上转型  变成了Phone类
		v2.call("13428394849");
		v2.sendMessage("猫猫", "出去玩");
//		v2.getPhoto("我自己");//父类中没有
//		v2.play("cod");
		
		
		
	}

}
