package Homework1从员工工资管理理解继承;

public class Employee extends Staff{
	
	
	@Override
	public double getTrueSalary(int salary, int score) {
		return salary * 0.9  + salary *0.1 *score*0.01;
		//员工责任相对小
	}
	

}
