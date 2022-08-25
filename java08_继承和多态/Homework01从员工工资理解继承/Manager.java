package Homework1从员工工资管理理解继承;

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

	//此处经理的实际工资计算和普通员工的计算不同，因此有一部分需要改动,经理责任大
	//source 再点击 override implment 
	

}
