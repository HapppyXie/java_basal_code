/*
 *  C语言struct 结构体-造类型
 *  struct Product{
 *       结构体成员
 *  }
 * 
 * */// product类中
public class Product {
	//类成员变量-属性（类属性）
	private int productId;      //此处为创建商品要使用的类型，
	private String productName;
	private String productType;
	private float productPrice;
	private int productStock;
	private String productDescribtion;
	//利用发现Product类中有两个方法，而且都叫Product 此为方法的重载：允许一个类中出现同名的方法，但方法的参数不同
	//注意：构造方法没有返回值类型，构造方法名和类名相同
	//在这个类中默认有下面的无参的构造方法
//	public Product() {
//		
//	}
	//人为添加有参构造，会自动覆盖无参构造，可自己手动添加无参构造
	public Product(int productId , String productName , String productType , float productPrice , int productStock , String productDescribtion) {
		//通过参数给所创建的对象赋值  java提供的this 
		//创建的对象是谁就给那个对象赋值
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
		this.productDescribtion = productDescribtion;
		this.productStock = productStock;
		
	} //构造方法有返回值,相当于自定义了一个方法
     public int Product() {
		
    	 return 0;
	}
     
     public Product() {
    	 
     }
//	
//	public Product() {
//		
//	}//这里的有参，无参构造方法给对象创建空间  
	//构造方法快捷方式：右击鼠标，找到source 找到 gernerate constructor using fields
	//默认会有一个super();可暂时删掉
	
	
	
	
	
	
	
	
	
	
	
	
	
	

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
	}//此处的productId可改例如编号，但不建议改动
	
	
}
//	toString方法：主要用于测试 看我们是否赋完值了
//	          toString方法用于打印类时自动将类转化成字符串形式，打印对象时会自动调用
	//source找到toString
	
	
	
	//公共访问方法
	//get-获得数据 得到return值
//	public int getProductId() {
//		return productId;
//		
//	}
	//set-设置，给变量赋值，通过参数给当前对象属性赋值
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
	
	//再来
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
	//同理
//	public String getProductType() {
//		return productType;
//	}
//	public void setProductType(String productType) {
//		this.productType = productType;
//	}
//	
//	public float getProductPrice() {
//		return productPrice;
//	}
//	public void setProductPrice(float productPrice) {
//		this.productPrice = productPrice;
//	}
//	
//	public int getProductStock() {
//		return productStock;
//	}
//	public void setProductStock(int productStock) {
//		this.productStock = productStock;
//	}
//
//	public String getProductDescribtion() {
//		return productDescribtion;
//	}
//	public void setProductDescribtion(String productDescribtion) {
//		this.productDescribtion = productDescribtion;
//	}以后再实际工程当中，如下 右击鼠标，找到source 再找到gernerate getters and setters
//  写完私有属性，写构造方法，然后写访问方法
	
	


