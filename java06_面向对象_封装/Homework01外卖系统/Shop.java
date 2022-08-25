package Homeork01外卖系统;

public class Shop {
	private int shopId;//此处相当于告诉程序 定义shopId是int类型的数据
	private String shopName;
	private String shopAddress;
	private String shopTelephone;

    public Shop() {
		
	}
	public Shop(int shopId, String shopName, String shopAddress, String shopTelephone) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
		this.shopAddress = shopAddress;
		this.shopTelephone = shopTelephone;
	}
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
	
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + ", shopAddress=" + shopAddress + ", shopTelephone="
				+ shopTelephone + "]";
	}
	
	

}
