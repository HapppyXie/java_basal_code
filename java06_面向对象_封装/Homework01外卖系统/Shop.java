package Homeork01����ϵͳ;

public class Shop {
	private int shopId;//�˴��൱�ڸ��߳��� ����shopId��int���͵�����
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
