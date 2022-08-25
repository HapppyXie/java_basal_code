package Homeork01Õ‚¬ÙœµÕ≥;

public class Product {
	private int productId;      
	private String productName;
	private String productType;
	private float productPrice;
	private int productStock;
	private String productDescribtion;
	
	
	
	
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, String productType, float productPrice, int productStock,
			String productDescribtion) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.productDescribtion = productDescribtion;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public String getProductDescribtion() {
		return productDescribtion;
	}

	public void setProductDescribtion(String productDescribtion) {
		this.productDescribtion = productDescribtion;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productPrice=" + productPrice + ", productStock=" + productStock + ", productDescribtion="
				+ productDescribtion + "]";
	}
	
	
	
	
	

}
