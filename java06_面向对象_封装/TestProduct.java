
public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product();
	//��ʱ p1.�޷�����Product��һЩ����productId...��Ϊ����˽����
		//���ô������������� ��ȡֵ
		p1.setProductId(1);
		p1.setProductName("�ɿڿ���");
		p1.setProductType("����");
		p1.setProductPrice(3);
		p1.setProductStock(50);
		p1.setProductDescribtion("��������");
		
		//��ӡֵ
		System.out.println(p1.getProductId());
//		System.out.println(p1.productId);��Ϊ˽�л��ˣ�ϵͳ������
		System.out.println(p1.getProductName());
	    System.out.println(p1.getProductType());
	    System.out.println(p1.getProductPrice());
	    System.out.println(p1.getProductStock());
	    System.out.println(p1.getProductDescribtion());
//	    System.out.println(p1);��û��ʹ��toSringʱ����ӡp1Ϊ��ַ
	    System.out.println(p1);
//����toString���ӡ��Product [productId=1, productName=�ɿڿ���, productType=����, productPrice=3.0, productStock=50, productDescribtion=��������]

	}
	

}
