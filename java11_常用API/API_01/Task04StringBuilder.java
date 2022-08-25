package API快速入门1;
/*
 * 字符缓冲类StringBuilder,该类创建的对象，其内容具有可更改性
 * 		StringBuilder的实质:可扩容
 * */
public class Task04StringBuilder {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		StringBuilder builder1 = builder;
		
		builder.append("hello");
		System.out.println(builder1 == builder);
		
		builder.append(" everyone");
		System.out.println(builder1 == builder);
		
		System.out.println(builder.toString());
		
		System.out.println("---------------");
		
		StringBuilder s1 = new StringBuilder("我的猫");
		s1.delete(0, 1);
		System.out.println(s1);
		System.out.println(s1.capacity());
		System.out.println("---------");
		s1.insert(0, "我");
		s1.insert(0,s1);//在0插入s1
		System.out.println(s1);
		System.out.println(s1.substring(3));//返回子字符串
		
		System.out.println("---------------");
		s1.reverse();
		System.out.println(s1.toString());
		
		
	}

}
