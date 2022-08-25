package Homework;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1.数据的存储：ArraysList
 * 2.主要业务：add(),delete(),update(),query(),printAll()
 * 3.辅助业务：createId(),printProduct(int index),findIndex(int id) 
 * 4.数据格式验证 
 * 
 * 同样先从辅助业务开始
 * */
public class Homework01ProductManger {
	//存储商品的数组
	//public static Product [] products = new Product[100];
	//保存商品数组的当前的最大下标
	//public static int maxIndex = -1;
	static Scanner sc = new Scanner(System.in);
	static ArrayList <Product> Product = new ArrayList<Product>();
	
	public static void main(String[] args) {
		int select = 0;
		while(true) {
			System.out.println("-----------------------------------------------");			
			System.out.println("--1.增加--2.删除--3.修改--"
							+ "4.查询--5.打印全部--6.退出--");			
			System.out.println("-----------------------------------------------");
		    System.out.println("请选择业务:");
		    //需验证
		    select = sc.nextInt();		    
		    switch(select) {	     
		    case 1:
		    	save();//
		    	break;
		    case 2:
		    	delete();
		    	break;
		    case 3:
		    	update();
		    	break;
		    case 4:
		    	query();
		    	break;
		    case 5:
		    	printAll();
		    	break;
		    case 6:
		    	System.exit(0);
		    default:
		    		System.out.println("你的选择有误，请重新选择！");
		    }
		}
	}
	
             //增加
	private static void save() {
		// TODO Auto-generated method stub
		System.out.println("-------------增加商品----------------");
        //maxIndex++;
        int id = createNo();
        System.out.println("请输入名称");
        String name = sc.next();
        System.out.println("请输入类别");
        String category = sc.next();
        System.out.println("请输入价格");
        double price = sc.nextDouble();
        System.out.println("请输入库存");
        int stock = sc.nextInt();
        System.out.println("请输入描述");
        String describtion = sc.next();
        
        //组合对象
//int id, String name, String category, double price, int stock, String describtion, int state
        Product p = new Product(id, name , category , price , stock , describtion , 1);
        //products[maxIndex] = p; 
        //存入集合
        Product.add(p);
        printAll();
        System.out.println("增加成功");
	}
	
           //删除
	private static void delete() {
		System.out.println("-----------删除商品------------");
		System.out.println("-----------请输入要删除的商品编号--------------");
		int id = sc.nextInt();
		int index = findIndex(id);
		//判断商品是否存在
		if(index == -1) {
			System.out.println("没有找到该商品信息");
		}else if(Product.get(id).getState() == 0) {
			System.out.println("该商品已被删除");
		}else {
			//打印商品信息
			printProduct(index);
			
			System.out.println("你确定要删除吗？ 1是  0否");
			int answer = sc.nextInt();
			//执行删除
			if(answer == 1) {
			Product.get(index).setState(0);
			System.out.println("删除成功");
			}else if(answer == 0) {
				System.out.println("取消删除");
			}else {
				System.out.println("你的选择有误，请重新选择！");
			}
		}
	}
           //修改
	private static void update() {
		System.out.println("------------修改商品------------");
		System.out.println("请输入要修改的商品编号");
		int id = sc.nextInt();
		int index = findIndex(id);
		//查找商品
		if(index == -1) {
			System.out.println("没有找到该商品信息");
		}else if(Product.get(index).getState() == 0) {
			System.out.println("该商品已被删除");
		}else {
			printProduct(index);
			System.out.println("请重新输入商品信息");
			System.out.println("请输入名称");
	        String name = sc.next();
	        System.out.println("请输入类别");
	        String category = sc.next();
	        System.out.println("请输入价格");
	        double price = sc.nextDouble();
	        System.out.println("请输入库存");
	        int stock = sc.nextInt();
	        System.out.println("请输入描述");
	        String description = sc.next();
   //重新组合对象 也可逐个修改
	        //Product p = new Product(id,name,category,price,stock,description, 1);
	        Product.get(index).setId(id);
	        Product.get(index).setName(name);
	        Product.get(index).setCategory(category);
	        Product.get(index).setPrice(price);
	        Product.get(index).setStock(stock);
	        Product.get(index).setDescription(description);
	        Product.get(index).setState(1);
	        printAll();
	        System.out.println("修改成功");
		}
	}
         private static void query() {
	    System.out.println("-------------查询-------------");		
		System.out.println("------1.名称--2.类别------");
		int select = sc.nextInt();
		if(select == 1) {
			//1.按名称查寻
			System.out.println("请输入名称关键字:");
			String Name = sc.next();
			int flag = 0;
			for(int y = 0 ; y <= Product.size() ; y++) {
				//indexOf()模糊查找
				// s1 = 鸡腿堡; s2 = 鸡   
				//s1.indexOf(s2)在s1中查找存不存在s2这个字符串
				//找不到 s1.indexOf(s2) = -1 找到则返回当前索引
		if(Product.get(y).getName().indexOf(Name) != -1 && Product.get(y).getState() == 1) {
				System.out.println(Product.get(y));
				flag = 1;
				}
			}			
			if(flag == 0) {System.out.println("没有查询到该商品信息");}			
		}else if(select == 2) {
			
			//2.按类别查询
			System.out.println("输入类别关键字");
			String Category = sc.next();
			int flag = 0;
			for(int y = 0 ; y <= Product.size() ; y++) {
				if(Product.get(y).getCategory().indexOf(Category) != -1 && Product.get(y).getState() == 1) {
					System.out.println(Product.get(y));
				}
			}
			System.out.println("没有查询到该商品的信息");
			
		}else {
			System.out.println("你输入的类别有误！");
		}
		}
		
         //打印所有  正常  的商品信息
	private static void printAll() {
		System.out.println("---------------打印所有商品信息-------------------");
		for(int j = 0 ; j < Product.size() ; j++) {
			if(Product.get(j).getState() == 1) {//判断商品状态
			System.out.println(Product.get(j));
			}
		}
	}
	
	/*
	 * 辅助业务1：自动生成编号
	 * 
	 * */
	public static int createNo() {
//		if(maxIndex == 0) {
//			return 1;
//		}else {
//			//上一个商品的编号+1
//			return products[maxIndex-1].getId()+1;
//		}
		if(Product.isEmpty()) {
			return 1;
		}else {
			int index = Product.size()-1;
			return Product.get(index).getId()+1;
		}
	}
	
	public static int findIndex(int id) {
		int index = -1;//个人觉得 id减去1后等于index，没有考虑商品删除后索引的改变，不在符合+1=id的规律
		for(int i = 0 ; i <= Product.size() ; i++) {
			if(id == Product.get(i).getId() && Product.get(i).getState()==1){
				index = i;
				break;
			}
		}
		return index;	
		
	}
	//打印指定索引下的商品
	public static void printProduct(int index) {
	     System.out.println(Product.get(index));
	}
}