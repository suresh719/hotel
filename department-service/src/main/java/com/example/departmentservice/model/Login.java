package com.example.departmentservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="login")
@Table 
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id; 
	
	@Column  
	private String username;  
	
	@Column  
	private String password;

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}  
}
 
