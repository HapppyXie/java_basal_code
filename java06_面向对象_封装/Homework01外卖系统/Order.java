package Homeork01外卖系统;
/*
 * 编号 姓名 电话 地址 总价 
 * 订单状态  0未提交 1已提交 2已发货 3未收货
 * 支付状态  0未支付 1已支付 
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
