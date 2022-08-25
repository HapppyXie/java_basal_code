
public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product();
	//此时 p1.无法看见Product的一些属性productId...因为将其私有了
		//利用创建的两个方法 获取值
		p1.setProductId(1);
		p1.setProductName("可口可乐");
		p1.setProductType("饮料");
		p1.setProductPrice(3);
		p1.setProductStock(50);
		p1.setProductDescribtion("冰镇，清凉");
		
		//打印值
		System.out.println(p1.getProductId());
//		System.out.println(p1.productId);因为私有化了，系统看不见
		System.out.println(p1.getProductName());
	    System.out.println(p1.getProductType());
	    System.out.println(p1.getProductPrice());
	    System.out.println(p1.getProductStock());
	    System.out.println(p1.getProductDescribtion());
//	    System.out.println(p1);再没有使用toSring时，打印p1为地址
	    System.out.println(p1);
//加上toString后打印出Product [productId=1, productName=可口可乐, productType=饮料, productPrice=3.0, productStock=50, productDescribtion=冰镇，清凉]

	}
	

}
