package com.dataconnectivity.studentportal;

public class Student 
{
	private String stdId;
	private String stdName;
	private String standard;
	private int age;
	// parameterised constructor
	public Student(String stdId, String stdName, String standard, int age) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.standard = standard;
		this.age = age;
	}
	
	//getter and setter methods
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	//to override toString() method
	

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", standard=" + standard + ", age=" + age + "\n";
	}
}
