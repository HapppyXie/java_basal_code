package Homeork02教务系统;

public class Student {
	private int studentId;
	private String studentName;
	private String studentGender;
	private String studentClass;
	private String studentGrade;
	private String studentPhone;
	
	public Student() {
		
	}

	public Student(int studentId, String studentName, String studentGender, String studentClass, String studentGrade,
			String studentPhone) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentClass = studentClass;
		this.studentGrade = studentGrade;
		this.studentPhone = studentPhone;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGender=" + studentGender
				+ ", studentClass=" + studentClass + ", studentGrade=" + studentGrade + ", studentPhone=" + studentPhone
				+ "]";
	}
	
	
	

}
