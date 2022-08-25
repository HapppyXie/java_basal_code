package Homeork01外卖系统;
/*
 * 1.无参构造测试
 * 2.使用有参构造测试
 * */
public class Test外卖系统 {
	public static void main(String[] args) {
		
	//1.
	Product p1 = new Product();
	Shop s1 = new Shop();
    User u1 = new User();
    
    Order o1 = new Order();
    System.out.println(o1);
    System.out.println("--------------------");
    o1.setOrderId(9);
    o1.setOrderName("啊旺");
    o1.setOrderAddress("西湖大道120号");
    o1.setOrderTelephone("15896587458");
    o1.setOrderTotalPrice(14);
    o1.setPaidState(1);
    o1.setOrderState(1);
    System.out.println(o1);
    System.out.println("---------------------");
    //2.
    
//    int orderId, String orderName, String orderTelephone, String orderAddress, float orderTotalPrice,
//	int orderState, int paidState
    Order o2 = new Order(8 , "马老" , "13428394849" , "西湖大道119号" , 20 , 0 , 0);
    System.out.println(o2);
    o2.setOrderState(1);
    o2.setPaidState(1);
    System.out.println("---------------------");
    System.out.println(o2);
    System.out.println(o2.getOrderAddress());
    
    
}
}