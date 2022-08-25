/*
 *     店铺类
 * 
 * */
public class Shop {
	//类属性
	private int shopId;//此处相当于告诉程序 定义shopId是int类型的数据
	private String shopName;
	private String shopAddress;
	private String shopTelephone;
	//无参和有参的类型构造方法
	public Shop() {
		
	}
	public Shop(int shopId, String shopName, String shopAddress, String shopTelephone) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopTelephone = shopTelephone;
	}
	

	//写访问方法
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopTelephone() {
		return shopTelephone;
	}
	public void setShopTelephone(String shopTelephone) {
		this.shopTelephone = shopTelephone;
	}
	
	//写访问方法，完成了店铺的封装
	
	/*
	 * 理解封装 含义 1层：将属性，方法封装成一个类
	 *           2层： 隐藏内部实现细节，提供外部访问接口
	 *            生活事例：快递打包 查询快递单号 查询数据号码归属地 ATM机
	 *            
	 *   基本实现：属性私有化 private
	 *          提供公共的访问方法 public set
	 *                        public get
	 *                     
	 *   案例1：商品类封装
	 *   案例2：店铺类封装
	 * 
	 * 
	 * */
	
	
	
	
	
	
	

}
