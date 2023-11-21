package com.suresh.employeeservice.service;

import java.util.List;

import com.suresh.employeeservice.model.Student;


public interface HotelService {

	public String saveOrUpdate(Student student);
	
	public List<Student> getAll();
	
	public Student getSingleData(int id);
	
	public String deleteData(int id);
}
