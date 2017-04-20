package org.mks.webapp.entity;

import java.util.ArrayList;
import java.util.Date;

public class StudentEntity {
	private String studentName;
	private String studentHobby;
	private Long studentMobileNumber;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	private AddressEntity studentAddress;

	public AddressEntity getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(AddressEntity studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(Long studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
}
