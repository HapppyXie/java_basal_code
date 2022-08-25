import java.util.Scanner;


public class Test商品管理myself {
	
	public static Product [] p1 = new Product[20]; 
	public static Scanner sc = new Scanner(System.in);
	public static int maxIndex = -1;

	
	public static void main(String[] args) {
		while(true) {
      System.out.println("商品管理，请选择服务：");
      System.out.println("---------");
      System.out.println("1.增加商品    2.删除商品");
      System.out.println("3.修改商品    4.查询商品");
      System.out.println("5.打印商品信息 6.退出系统");
            int select = sc.nextInt();
            switch(select) {
            case 1:
            	save();
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
            	System.out.println("退出系统成功");
            }
		}
	}


	
	private static void save() {
		//增加方法 需要增加 id name category price stock describtion state 
		//其中 id 和 state 系统自动匹配  id就是索引maxIndex+1即可
		  System.out.println("进入商品增加页面");
		  maxIndex++;
          int id = maxIndex+1;
          System.out.println("名称");
          String name = sc.next();
          System.out.println("类别");
          String category = sc.next();
          System.out.println("价格");
          double price = sc.nextDouble();
          System.out.println("库存");
          int stock = sc.nextInt();
          System.out.println("描述");
          String describtion = sc.next();
          int state = 1;
          //组合对象,先创建一个Product类型的对象p，并存入商品信息 
          Product p = new Product(id,name,category,price,stock,describtion,state);
		  //再将对象p作为数组中的一组存入p1数组
          p1[maxIndex] = p;
          System.out.println("增加商品成功");
	}


	private static void delete() {
		System.out.println("进入删除页面");
		System.out.println("亲输入要删除的商品编号");
		int id = sc.nextInt();
		int index =id-1;
		int flag = 0;
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(index == i) {
				flag = 1;
				System.out.println(p1[index]);
				System.out.println("确定删除吗？ 1是 0否");
				int answer = sc.nextInt();
				if(answer == 1) {
					p1[index].setState(0);
					System.out.println("删除成功");
				}else{
					System.out.println("取消删除");
				}
			}
			}
		if(flag == 0) {
			System.out.println("没有找到该编号的商品");}
	}


	private static void update() {
		// 修改商品 即重新接受数据，但id和state不变
		//先通过编号找到该商品
		System.out.println("请输入编号");
		int id = sc.nextInt();
		int index = id-1;
		//得分找不找得到
		int flag = 0;
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(index == i) {
				if(p1[index].getState() == 1) {
					System.out.println(p1[index]);
					flag = 1;
				}else {
					System.out.println("该商品已被删除");}
			}
		}
		if(flag == 1) {
	    System.out.println("请重新输入");
		System.out.println("名称");
        String name = sc.next();
        System.out.println("类别");
        String category = sc.next();
        System.out.println("价格");
        double price = sc.nextDouble();
        System.out.println("库存");
        int stock = sc.nextInt();
        System.out.println("描述");
        String describtion = sc.next();
		
		//重新组合对象，可选择逐个重新组合，这样就可以不变一些变量
		Product p = new Product(id,name,category,price,stock,describtion,1);
		p1[index] = p;
		System.out.println("修改成功");
		}else {System.out.println("没有找到该编号的商品");}
	}


	private static void query() {
		// 查找商品 
		System.out.println("进入查找页面");
		System.out.println("------------");
		System.out.println("请输入商品编号id");
		int id = sc.nextInt();
		int index = id-1;
		int flag = 0;
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(index == i) {
		       if(p1[index].getState() == 1) {
		    	   System.out.println(p1[index]);
		    	   flag = 1;
		       }else {
		    	   System.out.println("该商品已被删除");
		       }
			}
		}
		if(flag == 0) {
			System.out.println("没有查找到该编号的商品");
		}
		
	}


	private static void printAll() {
		for(int i = 0 ; i <= maxIndex ; i++) {
			if(p1[i].getState() == 1) {
				System.out.println(p1[i]);
			}
		}
		
	}


		

}
