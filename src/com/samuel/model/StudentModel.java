package com.samuel.model;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.samuel.annotations.IsValidHobby;

public class StudentModel {
	@Size(min=2, max=30)
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	
	@IsValidHobby
	private String studentHobby;
	private long studentMobile;
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private AddressModel studentAddress;
	
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
	
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
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
	public AddressModel getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(AddressModel studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	

}
