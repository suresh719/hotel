package com.example.departmentservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.model.Student;
import com.example.departmentservice.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired  
	HotelRepository hotelRepository; 
	
	/*public Student saveOrUpdate1(Student students)   
	{  
		return hotelRepository.save(students);  
	}*/

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return  hotelRepository.findAll(); 
	}

	@Override
	public String saveOrUpdate(Student student) {
		// TODO Auto-generated method stub
		hotelRepository.save(student);  
		return "Data Stored Successfully";
	}

	@Override
	public Student getSingleData(int id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).get();
	}

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub
		hotelRepository.deleteById(id);
		return "Data Deleted Successfully";
	}
}
