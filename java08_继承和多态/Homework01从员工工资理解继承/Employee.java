package Homework1��Ա�����ʹ������̳�;

public class Employee extends Staff{
	
	
	@Override
	public double getTrueSalary(int salary, int score) {
		return salary * 0.9  + salary *0.1 *score*0.01;
		//Ա���������С
	}
	

}
