package Homeork02教务系统;
/*学生类，教师类，课程类，成绩类
 * 
 * */
public class Test教务系统 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Student s1 = new Student();
	  Curriculum c1 = new Curriculum();
	  //1.无参构造测试学生类
	  s1.setStudentId(52);
	  s1.setStudentName("阿狗");
	  s1.setStudentGender("男生");
	  s1.setStudentClass("导弹一班");
	  s1.setStudentGrade("2009级");
	  s1.setStudentPhone("110120119");
	  
	  System.out.println(s1);
	  
	  System.out.println("-----------------------");
	  
	  //2.有参构造测试学生类
//	  int studentId, String studentName, String studentGender, String studentClass, String studentGrade,
//		String studentPhone
	  
	  Student s2 = new Student(77,"二狗","女生","卫星二班","2009级","123654789");
	  
	  System.out.println(s2);
	}

}
