/*
 *  C����struct �ṹ��-������
 *  struct Product{
 *       �ṹ���Ա
 *  }
 * 
 * */// product����
public class Product {
	//���Ա����-���ԣ������ԣ�
	private int productId;      //�˴�Ϊ������ƷҪʹ�õ����ͣ�
	private String productName;
	private String productType;
	private float productPrice;
	private int productStock;
	private String productDescribtion;
	//���÷���Product�������������������Ҷ���Product ��Ϊ���������أ�����һ�����г���ͬ���ķ������������Ĳ�����ͬ
	//ע�⣺���췽��û�з���ֵ���ͣ����췽������������ͬ
	//���������Ĭ����������޲εĹ��췽��
//	public Product() {
//		
//	}
	//��Ϊ����вι��죬���Զ������޲ι��죬���Լ��ֶ�����޲ι���
	public Product(int productId , String productName , String productType , float productPrice , int productStock , String productDescribtion) {
		//ͨ���������������Ķ���ֵ  java�ṩ��this 
		//�����Ķ�����˭�͸��Ǹ�����ֵ
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
		this.productDescribtion = productDescribtion;
		this.productStock = productStock;
		
	} //���췽���з���ֵ,�൱���Զ�����һ������
     public int Product() {
		
    	 return 0;
	}
     
     public Product() {
    	 
     }
//	
//	public Product() {
//		
//	}//������вΣ��޲ι��췽�������󴴽��ռ�  
	//���췽����ݷ�ʽ���һ���꣬�ҵ�source �ҵ� gernerate constructor using fields
	//Ĭ�ϻ���һ��super();����ʱɾ��
	
	
	
	
	
	
	
	
	
	
	
	
	
	

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
	}//�˴���productId�ɸ������ţ���������Ķ�
	
	
}
//	toString��������Ҫ���ڲ��� �������Ƿ���ֵ��
//	          toString�������ڴ�ӡ��ʱ�Զ�����ת�����ַ�����ʽ����ӡ����ʱ���Զ�����
	//source�ҵ�toString
	
	
	
	//�������ʷ���
	//get-������� �õ�returnֵ
//	public int getProductId() {
//		return productId;
//		
//	}
	//set-���ã���������ֵ��ͨ����������ǰ�������Ը�ֵ
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
	
	//����
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
	//ͬ��
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
//	}�Ժ���ʵ�ʹ��̵��У����� �һ���꣬�ҵ�source ���ҵ�gernerate getters and setters
//  д��˽�����ԣ�д���췽����Ȼ��д���ʷ���
	
	


