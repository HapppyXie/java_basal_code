package �ڲ���;

/*
 * ������(��ֲ���)�����������������͵��ڲ��ࡣ
 * ����ڲ�����һ���������������������ͳ�Ϊ�����࣬��û�������ı��������������
 * 
 * 
 * */
public class Task05 {
	public static void main(String[] args) {
		ClassA ca = new ClassA(){
			void aMethod() {
				//��д�ķ����ſɱ������Ķ������ⲿ����
				System.out.println("����������Ŷ������");
				bMethod();
			}
			
			//�޷����ⲿʹ�ø÷���,��������
			void bMethod() {
				System.out.println("������׷�ӵķ�������Ŷ������");
			}
		};
		
		ca.aMethod();
		inner i = new inner();
		//����Ϊstatic���޷��ٵ��ã��ⲿ��ĳ�Ա��
		
	}
	
	
	
	public void A(){
		System.out.println("A����");
	}
	
	public static class inner{
		
	}
}
