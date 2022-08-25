package Homework;
import java.util.Scanner;
/*
 * 使输入的都符合数据格式要求
 * 
 * 分析：对输入单独设计一个方法，在该方法中进行格式验证，最终返回符合格式要求的数据
 * 		获得选项 int getSelectNum()
 * 		获得单价 double getPrice()
 * 		获得库存 int getStore()
 * 		
 * */
public class ProductManger_Homework05 {
	//存储商品的数组
	public static Product [] products = new Product[100];
	//保存商品数组的当前的最大下标
	public static int maxIndex = -1;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int select = 0;
		while(true) {
			System.out.println("-----------------------------------------------");
			
			System.out.println("--1.增加--2.删除--3.修改--4.查询--5.打印全部--6.退出--");
			
			System.out.println("-----------------------------------------------");
		    System.out.println("请选择业务:");
		    select = getSelectNum();
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
        maxIndex++;
        int id = createNo();
        System.out.println("请输入名称");
        String name = sc.next();
        System.out.println("请输入类别");
        String category = sc.next();
        System.out.println("请输入价格");
        double price = getPrice();
        System.out.println("请输入库存");
        int stock = getStore();
        System.out.println("请输入描述");
        String describtion = sc.next();
        //组合对象
//int id, String name, String category, double price, int stock, String describtion, int state
        Product p = new Product(id, name , category , price , stock , describtion , 1);
        products[maxIndex] = p; 
        System.out.println("增加成功");
	}
  
	//删除
	private static void delete() {
		// TODO Auto-generated method stub
		System.out.println("-----------删除商品------------");
		System.out.println("-----------请输入要删除的商品编号--------------");
		int id = sc.nextInt();
		int index = findIndex(id);
		if(index == -1) {
			System.out.println("没有找到该商品信息");
		}else if(products[index].getState() == 0) {
			System.out.println("该商品已被删除");
		}else {
			//打印商品信息
			printProduct(index);
			System.out.println("你确定要删除吗？ 1是  0否");
			int answer = sc.nextInt();
			//执行删除
			if(answer == 1) {
			products[index].setState(0);
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
		// TODO Auto-generated method stub
		System.out.println("------------修改商品------------");
		System.out.println("请输入要修改的商品编号");
		int id = sc.nextInt();
		int index = findIndex(id);
		//查找商品
		if(index == -1) {
			System.out.println("没有找到该商品信息");
		}else if(products[index].getState() == 0) {
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
	        String describtion = sc.next();
   //重新组合对象 也可逐个修改
	        Product p = new Product(id,name,category,price,stock,describtion, 1);
	        products[maxIndex] = p; 
	        System.out.println("修改成功");
		}
	}
         //查询  根据名称或类别 描述
	private static void query() {
		// TODO Auto-generated method stub
        System.out.println("-------------查询-------------");		
		System.out.println("------1.名称--2.类别------");
		int select = sc.nextInt();
		if(select == 1) {
			//按名称查寻
			System.out.println("请输入名称关键字:");
			String Name = sc.next();
			int flag = 0;
			for(int y = 0 ; y <= maxIndex ; y++) {
				//indexof()模糊查找
				// s1 = 鸡腿堡; s2 = 鸡   
				//s1.indexOf(s2)在s1中查找存不存在s2这个字符串
				//找不到 s1.indexOf(s2) = -1 找到则返回当前索引
				if(products[y].getName().indexOf(Name) != -1 && products[y].getState() == 1) {
					System.out.println(products[y]);
					flag = 1;
				}
			}			
			if(flag == 0) {System.out.println("没有查询到该商品信息");}
			
		}else if(select == 2) {
			//按类别查询
			System.out.println("输入类别关键字");
			String Category = sc.next();
			int flag = 0;
			for(int y = 0 ; y <= maxIndex ; y++) {
				if(products[y].getCategory().indexOf(Category) != -1 && products[y].getState() == 1) {
					System.out.println(products[y]);
				}
			}
			System.out.println("没有查询到该商品的信息");
			
		}else {
			System.out.println("你输入的类别有误！");
		}
		}	
         //打印所有  正常  的商品信息
	private static void printAll() {
		// TODO Auto-generated method stub
		System.out.println("---------------打印所有商品信息-------------------");
		for(int j = 0 ; j <= maxIndex ; j++) {
			if(products[j].getState() == 1) {//判断商品状态
			System.out.println(products[j]);
			}
		}
	}
	/*
	 * 辅助业务1：自动生成编号
	 * 
	 * */
	public static int createNo() {
		if(maxIndex == 0) {
			return 1;
		}else {
			//上一个商品的编号+1
			return products[maxIndex-1].getId()+1;
		}
	}
	/*
	 * 根据商品编号查找商品所在的数组的位置
	 * id 商品编号
	 * return 该商品再数组中的索引,如果找到返回索引值，如果找不到返回-1
	 * */
	public static int findIndex(int id) {
		int index = -1;//个人觉得 id减去1后等于index
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(id == products[i].getId()) {
				index = i;
				break;
			}
		}
		return index;	
	}
	//打印指定索引下的商品
	public static void printProduct(int index) {
	     System.out.println(products[index]);
	}
	/*
	 * 要求输入必须是数字
	 * */
	 private static int getSelectNum() {
		 String num = "";
		 String regex = "^[0-9]$";
		 while(true) {
			 num = sc.next();
			 if(!num.matches(regex)) {
				 System.out.println("输入的必须是范围内的数字，请重新输入");
				 continue;
			 }else {
				 break;
			 }			 
		 }
		 return Integer.parseInt(num);
		}
	 /*
	  * 要求输入的是浮点数
	  * */
    private static double getPrice() {
    	String price = "";
    	String regex = "^((([^0][0-9]+|0)\\.([0-9]{1,2}))$)|^(([1-9]+)\\.[0-9]{1,2})$)";
    	while(true) {
    		price = sc.next();
    		if(!price.matches(regex)) {
    			System.out.println("输入的必须是小数，请重新输入");
    			continue;
    		}else {
    			break;
    		}
    	}
	return Double.parseDouble(price);
}
	private static int getStore() {
		String store = "";
		String regex = "^([0-9])|([1-9][0-9]+)$";
		while(true) {
			store = sc.next();
			if(!store.matches(regex)) {
				System.out.println("输入的库存数据格式错误，请重新输入");
				continue;
			}else {
				break;
			}
		}
	return Integer.parseInt(store);
}
  
}