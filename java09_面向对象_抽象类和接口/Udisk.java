/*
 * u��ʵ�ֽӿڣ�implements��
 * 
 * 
 * 
 * */
public class Udisk implements Usb{
//����̳нӿڣ���ʵ�ֽӿڣ���Ҫ�Խӿ��еĳ��߷���������ʵ��
					//�����ӷ�������ԭ�еĽӿ��еķ�������ʵ�֣�ͨ��������
	//��Ŀ��ҵ��ʵ��ͨ�������ҵ��ӿ�
	// ��������Ʒ����ҵ��ӿ�   
	//Product   д����Ʒ��󣬿�newһ��interface  ��һ��û�г��֣���other �������interface
	//                    �õ�һ��ProductService
	
	
	@Override
	public void input() {
		System.out.println("Udisk���뷽��");
		
	}

	@Override
	public void output() {
		System.out.println("Udisk�������");
	}

	@Override
	public void charge() {
		System.out.println("Udisk��緽��");
	}
	
	

}
