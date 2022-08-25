package java泛型;

import java.util.*;//导入所有util接口

//通配符   
class Cage<E> extends LinkedList<E>{
	//创建Cage泛型集合
}
class Animal{
	public void feedMe() {
		//创建动物类
	}
}
class Lion extends Animal{
	public void feedMe() {//创建动物子类Lion
		System.out.println("Feding lions");
	}
}
class Butterfly extends Animal{
	public void feedMe() {//创建动物子类Butterfly
		System.out.println("Feeding butterflies");
	}
}
//测试通配符
public class TextBook02 {
	public static void main(String[] args) {
		TextBook02 t = new TextBook02();//创建一个测试对象
		Cage<Lion> lionCage = new Cage<Lion>();//将一个动物类放入一个泛型集合，形成一个狮子集合Cage的对象
		Cage<Butterfly> butterflyCage = new Cage<Butterfly>();//同上
		lionCage.add(new Lion());//往集合里增加狮子类对象
		butterflyCage.add(new Butterfly());
		t.feedMe(lionCage);
		t.feedMe(butterflyCage);
//通过测试对象调用其成员方法feedMe(),传入集合对象，对每个集合对象进行遍历，以此调用自身的feedMe() 
	}
	//<?>无限制通配符 表明未知的类，与<? extends Object>等价
	void feedMe(Cage<? extends Animal> someCage) {
		for(Animal a:someCage)
			a.feedMe();
	}
	

}
