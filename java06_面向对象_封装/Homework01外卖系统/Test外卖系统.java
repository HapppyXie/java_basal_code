package Homeork01����ϵͳ;
/*
 * 1.�޲ι������
 * 2.ʹ���вι������
 * */
public class Test����ϵͳ {
	public static void main(String[] args) {
		
	//1.
	Product p1 = new Product();
	Shop s1 = new Shop();
    User u1 = new User();
    
    Order o1 = new Order();
    System.out.println(o1);
    System.out.println("--------------------");
    o1.setOrderId(9);
    o1.setOrderName("����");
    o1.setOrderAddress("�������120��");
    o1.setOrderTelephone("15896587458");
    o1.setOrderTotalPrice(14);
    o1.setPaidState(1);
    o1.setOrderState(1);
    System.out.println(o1);
    System.out.println("---------------------");
    //2.
    
//    int orderId, String orderName, String orderTelephone, String orderAddress, float orderTotalPrice,
//	int orderState, int paidState
    Order o2 = new Order(8 , "����" , "13428394849" , "�������119��" , 20 , 0 , 0);
    System.out.println(o2);
    o2.setOrderState(1);
    o2.setPaidState(1);
    System.out.println("---------------------");
    System.out.println(o2);
    System.out.println(o2.getOrderAddress());
    
    
}
}