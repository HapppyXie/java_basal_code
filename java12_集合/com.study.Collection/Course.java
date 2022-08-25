package com.study.Collection;

public class Course {
	private Integer id;
	private String name;
	private Integer credit;
	private Integer hours;
	private String teacher;
	
	public Course() {
		super();
	}
	
	public Course(Integer id, String name, Integer credit, Integer hours, String teacher) {
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.hours = hours;
		this.teacher = teacher;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", credit=" + credit + ", hours=" + hours + ", teacher="
				+ teacher + "]";
	}

	@Override
	public int hashCode() {
		return id+name.hashCode();//��,ֻд����
	}

	
	@Override
	public boolean equals(Object obj) {
		//ΪObject��
		if(this == obj) {
			return true;
		}
		//��
		if(obj == null) {
			return false;
		}
		//��ͬ����
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		//�����ͬһ����
		Course c = (Course)obj;
		//����Ƚ�����
		if(this.id == c.id && this.name.equals(c.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
