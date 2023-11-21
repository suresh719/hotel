package com.example.departmentservice.service;

import java.util.List;

import com.example.departmentservice.model.Student;

public interface HotelService {

	public String saveOrUpdate(Student student);
	
	public List<Student> getAll();
	
	public Student getSingleData(int id);
	
	public String deleteData(int id);
}
