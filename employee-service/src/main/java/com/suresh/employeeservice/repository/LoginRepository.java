package com.suresh.employeeservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suresh.employeeservice.model.Login;


@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

	public Login findByUsername(String username);
	
}
