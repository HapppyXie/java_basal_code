/*
 * �����Ʒ��Ŀ���ǽ��ĳһ�ض����� ���̣�������
 *  ������̣���Ʒ�����Ʒ���û�����������Ϣ
 *  ��Ʒ����ţ����ƣ����ͼƬ�����ۣ���棬����
 *  ���̣��������ƣ����̵�ַ����ϵ�绰
 *  �û����˻������룬�ǳƣ��绰���ͻ���ַ
 * 
 * ���⣺��һ�Ļ������Ͳ����������ݵĴ洢 byte short int long char float double boolean
 *  ������Դ洢���������ֻ�ܴ���ͬһ����������
 *  
 *  �����������:������ ���磺Product���� public class Product{   }
 *     ��ʶ��   ��-�����ض�Ҫ��Ҫ������Щ���ݣ������µ�����type 
 *     ��ʶ����       ����-���µĴ������Ͷ���ı���
 *         ��������Product p1 = new Product();//��������-�����󿪱ٴ洢�ռ�
 *         new�ĺ���:���ݵ�ǰ�����ͣ��������а��������ݿ�����Ӧ�Ĵ洢�ռ�
 *                 new ���췽��() - ��������
 *                 ����p1 , java�г�Ϊ����  java����ջ�ڴ棬���ڴ� ����洢��ջ�ڴ���
 *                 ����洢ͼ��
 *                 ˵��
 *   ���췽������������Ĭ�ϻ���һ���޲εĹ��췽�� public Product() {
 *                                                             }
 *                                     Ϊ���󿪱ٴ洢�ռ�
 *                                     �����Ը�Ĭ��ֵ-��ֵ����Ϊ0
 *                                                ��������Ϊnull
 *                                                �������Ĭ��ֵ��ͬ
 *                                                
 *                                                
 *                                                
 *           ������Ϊ����вι���-����вι����Ḳ��Ĭ�ϵ��޲ι���
 *                           Ϊ���󿪱ٴ洢�ռ�
 *                           ��������ʱ���ݲ�������ǰ�������Ը�ֵ
 *    this:ָ���������Ķ�����
 *    
 * */
public class Task01��ʶ��Ͷ��� {
	public static void main(String[] args) {
		int num;  //������һ�� int ���͵�num
		Product p4 = new Product();// ͨ�������� ���˴�������һ��Product���͵ı��� p1
		Shop shop1;//�˴����߳���shop1��Shop���͵����ݣ���û�г�ʼ��
		User user1;
		
		//p4.productId = 5;//�˴�����ֱ�Ӹ�ֵ����Ϊ���������Լ����ٵ��࣬��û�з���洢�ռ� �ø��߼�������ٴ洢�ռ�
		p4.setProductId(5);
        p4.setProductName("��������");
		
//		System.out.println(p1);//��ӡ��������p1�����󣩴洢��ջ�ڴ���Ķ���-Product@123a439b-�������ַָ���Ƕ��ڴ����
		                           //  productId;productName;productType;......
		System.out.println(p4.getProductId());
		System.out.println(p4.getProductName());
		System.out.println("---------------------");
		//�����¶���һ������
		Product p2 = new Product();
//		System.out.println(p2.productId);//�˴�Ϊ��ʾû�ж�����privateʱ����û�и�ֵʱ����ӡ�����ĳ�ʼֵ
//		System.out.println(p2.productName);
//		System.out.println(p2);
//		Product p3 = p2;
//         System.out.println(p3);
		System.out.println("----------------------");
		//��Ϊ�вι���
		Product p3 = new Product(3 , "�������" , "С��" , 8 , 100 , "�ر��ر�óԲ����ʺ���ͣ�ҹ��ʳ��");
		System.out.println(p3.getProductDescribtion());
		
	}
	/*
	 * ��������淶��UpperGamelCase ������������
	 *   ����ĸ��д
	 *   ��ĳ�Ա(����)������������������lowerCamelCase С����������
	 * 
	 * */

}
