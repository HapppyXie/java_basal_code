package Homework1��Ա�����ʹ������̳�;
 /*
  * 
  * Ա���ĸ���
  * 
  * */
public class Staff {
	private String name;
	private int salary;//��������
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

	
	
	//��ȡʵ�ʹ��ʵķ���
	public double getTrueSalary(int salary,int score) {
		return salary * 0.8  + salary *0.2 *score*0.01;
	}

	@Override
	public String toString() {
		return "����" + name + ", ��н��" + salary + ", ��Ч��" + score + "ʵ�����ʣ�" + 
	getTrueSalary(salary,score);
	}
	
	public void toWork() {
		System.out.println("����ȥ�ϰ�");
	}
	public void toWork(String transport1, String transport2) {
		System.out.println("�ȳ���"+transport1+"�ٳ���"+transport2);
		
	}
	
	
	/*   ����ȫ��ͬ���ͣ�������
	 * public void toWork(String transport2, String transport1) {
	 * System.out.println("�ȳ���"+transport1+"�ٳ���"+transport2);
	 * 
	 * }
	 *///��������
	public void toWork(String transport2, int minutes1,String transport1,int minutes2) {
		System.out.println("�ȳ���"+transport1+"�ٳ���"+transport2);
		
	}
	
	
	
	
	
	
}
