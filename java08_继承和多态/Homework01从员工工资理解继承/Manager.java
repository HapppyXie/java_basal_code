package Homework1��Ա�����ʹ������̳�;

public class Manager extends Staff{
/*
 * 
 * 
 * 
 * */
	private int marketCost;
	
	
	
	
	
	public int getMarketCost() {
		return marketCost;
	}





	public void setMarketCost(int marketCost) {
		this.marketCost = marketCost;
	}





	@Override
	public double getTrueSalary(int salary, int score) {
		return salary * 0.7  + salary *0.3 *score*0.01 + getMarketCost();
	}

	//�˴������ʵ�ʹ��ʼ������ͨԱ���ļ��㲻ͬ�������һ������Ҫ�Ķ�,�������δ�
	//source �ٵ�� override implment 
	

}
