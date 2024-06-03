package com.techpalle.model;

public class Student {
	
	private int sno;
	private String sname;
	private String course;
	private String Gender;
	private String email;
	private String qualification;
	public Student(int sno, String sname, String course, String Gender, String email, String qualification) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.Gender = Gender;
		this.email = email;
		this.qualification = qualification;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getqualification() {
		return qualification;
	}
	public void setqualification(String qualification) {
		this.course = qualification;
	}
}
