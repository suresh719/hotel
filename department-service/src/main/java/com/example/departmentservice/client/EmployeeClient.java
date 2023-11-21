package com.example.departmentservice.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.example.departmentservice.model.Student;

@HttpExchange
public interface EmployeeClient {

	@GetExchange("/employee/getSingleData/{id}")
    public Student findByDepartment(@PathVariable("id") int stuID);

}
