package final_char_string关键字;

public class Customer {
	private final long customerId;
	private static long counter = 2021102901;
	public Customer() {
		this.customerId = counter++;
	}
	public long getCustomerId() {
		return customerId;
	}			//创建一个类，原来也可以在这个类里面实例化自己的类
	public static void main(String[] args) {
		Customer [] cc = new Customer[5];
		for(int i =0; i < cc.length; i++) {
			cc[i] = new Customer();
			System.out.println("The "+i+" CustomerId is"+cc[i].getCustomerId());
		}
	}
	
}
