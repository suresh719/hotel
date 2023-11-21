package com.suresh.employeeservice.service;

import java.util.List;

import com.suresh.employeeservice.model.Login;



public interface LoginService {

	public String saveOrUpdate(Login login);
	
	public List<Login> getAll();
	
	public Login getSingleData(int id);
	
	public String deleteData(int id);
	
	public Login findByUserName1(String userName);
	
	public Login findByUsername(String userName);
}
