package com.example.departmentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.model.Login;
import com.example.departmentservice.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository loginRepository;
	
	/*public Student saveOrUpdate1(Student students)   
	{  
		return hotelRepository.save(students);  
	}*/

	@Override
	public List<Login> getAll() {
		// TODO Auto-generated method stub
		return  loginRepository.findAll(); 
	}

	@Override
	public String saveOrUpdate(Login login) {
		// TODO Auto-generated method stub
		loginRepository.save(login);  
		return "Data Stored Successfully";
	}

	@Override
	public Login getSingleData(int id) {
		// TODO Auto-generated method stub
		return loginRepository.findById(id).get();
	}

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub
		loginRepository.deleteById(id);
		return "Data Deleted Successfully";
	}

	@Override
	public Login findByUserName1(String userName) {
		// TODO Auto-generated method stub
		Login l=new Login();
		//l=loginRepository.findByUserName(userName);
		return null;
	}

	@Override
	public Login findByUsername(String userName) {
		Login l=new Login();
		l=loginRepository.findByUsername(userName);
		return l;
	}

}
