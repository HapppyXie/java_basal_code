package Homework1从员工工资管理理解继承;
 /*
  * 
  * 员工的父类
  * 
  * */
public class Staff {
	private String name;
	private int salary;//基本工资
	private int score;
	
	
	public Staff() {
		
	}

	public Staff(String name, int salary, int score) {
		this.name = name;
		this.salary = salary;
		this.score = score;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
	//获取实际工资的方法
	public double getTrueSalary(int salary,int score) {
		return salary * 0.8  + salary *0.2 *score*0.01;
	}

	@Override
	public String toString() {
		return "姓名" + name + ", 底薪：" + salary + ", 绩效：" + score + "实发工资：" + 
	getTrueSalary(salary,score);
	}
	
	public void toWork() {
		System.out.println("开车去上班");
	}
	public void toWork(String transport1, String transport2) {
		System.out.println("先乘坐"+transport1+"再乘坐"+transport2);
		
	}
	
	
	/*   参数全部同类型，不可用
	 * public void toWork(String transport2, String transport1) {
	 * System.out.println("先乘坐"+transport1+"再乘坐"+transport2);
	 * 
	 * }
	 *///这样可以
	public void toWork(String transport2, int minutes1,String transport1,int minutes2) {
		System.out.println("先乘坐"+transport1+"再乘坐"+transport2);
		
	}
	
	
	
	
	
	
}
