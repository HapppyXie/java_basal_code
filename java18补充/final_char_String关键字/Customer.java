package final_char_string�ؼ���;

public class Customer {
	private final long customerId;
	private static long counter = 2021102901;
	public Customer() {
		this.customerId = counter++;
	}
	public long getCustomerId() {
		return customerId;
	}			//����һ���࣬ԭ��Ҳ���������������ʵ�����Լ�����
	public static void main(String[] args) {
		Customer [] cc = new Customer[5];
		for(int i =0; i < cc.length; i++) {
			cc[i] = new Customer();
			System.out.println("The "+i+" CustomerId is"+cc[i].getCustomerId());
		}
	}
	
}
