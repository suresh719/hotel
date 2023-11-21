package com.example.departmentservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="student")
@Table 
public class Student {

	@Id  
	@Column  
	private int studentid; 
	
	@Column  
	private String studentname;  
	
	@Column  
	private String studentplace;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentplace() {
		return studentplace;
	}

	public void setStudentplace(String studentplace) {
		this.studentplace = studentplace;
	}  
}
