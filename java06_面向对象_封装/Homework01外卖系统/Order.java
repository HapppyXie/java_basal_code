package Homeork01����ϵͳ;
/*
 * ��� ���� �绰 ��ַ �ܼ� 
 * ����״̬  0δ�ύ 1���ύ 2�ѷ��� 3δ�ջ�
 * ֧��״̬  0δ֧�� 1��֧�� 
 * 
 * 
 * 
 * */
public class Order {
	private int orderId;
	private String orderName;
	private String orderTelephone;
	private String orderAddress;
	private float orderTotalPrice;
	private int orderState;
	private int paidState;
	
	public Order() {
		
	}

	public Order(int orderId, String orderName, String orderTelephone, String orderAddress, float orderTotalPrice,
			int orderState, int paidState) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderTelephone = orderTelephone;
		this.orderAddress = orderAddress;
		this.orderTotalPrice = orderTotalPrice;
		this.orderState = orderState;
		this.paidState = paidState;
	}

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderTelephone() {
		return orderTelephone;
	}

	public void setOrderTelephone(String orderTelephone) {
		this.orderTelephone = orderTelephone;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public float getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(float orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public int getOrderState() {
		return orderState;
	}

	public void setOrderState(int orderState) {
		this.orderState = orderState;
	}

	public int getPaidState() {
		return paidState;
	}

	public void setPaidState(int paidState) {
		this.paidState = paidState;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderTelephone=" + orderTelephone
				+ ", orderAddress=" + orderAddress + ", orderTotalPrice=" + orderTotalPrice + ", orderState="
				+ orderState + ", paidState=" + paidState + "]";
	}
	
	
	

}
