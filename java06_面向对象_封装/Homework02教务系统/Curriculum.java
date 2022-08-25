package Homeork02教务系统;

public class Curriculum {
	private int curriculumId;
	private String curriculumDefinition;
	private String curriculumDescribtion;
	private int curriculumClassHour;
	private String curriculumTeacher;
	private String curriculumRegularTime;
	
	
	public Curriculum() {
		
	}


	public Curriculum(int curriculumId, String curriculumDefinition, String curriculumDescribtion,
			int curriculumClassHour, String curriculumTeacher, String curriculumRegularTime) {
		super();
		this.curriculumId = curriculumId;
		this.curriculumDefinition = curriculumDefinition;
		this.curriculumDescribtion = curriculumDescribtion;
		this.curriculumClassHour = curriculumClassHour;
		this.curriculumTeacher = curriculumTeacher;
		this.curriculumRegularTime = curriculumRegularTime;
	}


	public int getCurriculumId() {
		return curriculumId;
	}


	public void setCurriculumId(int curriculumId) {
		this.curriculumId = curriculumId;
	}


	public String getCurriculumDefinition() {
		return curriculumDefinition;
	}


	public void setCurriculumDefinition(String curriculumDefinition) {
		this.curriculumDefinition = curriculumDefinition;
	}


	public String getCurriculumDescribtion() {
		return curriculumDescribtion;
	}


	public void setCurriculumDescribtion(String curriculumDescribtion) {
		this.curriculumDescribtion = curriculumDescribtion;
	}


	public int getCurriculumClassHour() {
		return curriculumClassHour;
	}


	public void setCurriculumClassHour(int curriculumClassHour) {
		this.curriculumClassHour = curriculumClassHour;
	}


	public String getCurriculumTeacher() {
		return curriculumTeacher;
	}


	public void setCurriculumTeacher(String curriculumTeacher) {
		this.curriculumTeacher = curriculumTeacher;
	}


	public String getCurriculumRegularTime() {
		return curriculumRegularTime;
	}


	public void setCurriculumRegularTime(String curriculumRegularTime) {
		this.curriculumRegularTime = curriculumRegularTime;
	}


	@Override
	public String toString() {
		return "Curriculum [curriculumId=" + curriculumId + ", curriculumDefinition=" + curriculumDefinition
				+ ", curriculumDescribtion=" + curriculumDescribtion + ", curriculumClassHour=" + curriculumClassHour
				+ ", curriculumTeacher=" + curriculumTeacher + ", curriculumRegularTime=" + curriculumRegularTime + "]";
	}
	
	

}
