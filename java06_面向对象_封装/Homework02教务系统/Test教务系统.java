package Homeork02����ϵͳ;
/*ѧ���࣬��ʦ�࣬�γ��࣬�ɼ���
 * 
 * */
public class Test����ϵͳ {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Student s1 = new Student();
	  Curriculum c1 = new Curriculum();
	  //1.�޲ι������ѧ����
	  s1.setStudentId(52);
	  s1.setStudentName("����");
	  s1.setStudentGender("����");
	  s1.setStudentClass("����һ��");
	  s1.setStudentGrade("2009��");
	  s1.setStudentPhone("110120119");
	  
	  System.out.println(s1);
	  
	  System.out.println("-----------------------");
	  
	  //2.�вι������ѧ����
//	  int studentId, String studentName, String studentGender, String studentClass, String studentGrade,
//		String studentPhone
	  
	  Student s2 = new Student(77,"����","Ů��","���Ƕ���","2009��","123654789");
	  
	  System.out.println(s2);
	}

}
