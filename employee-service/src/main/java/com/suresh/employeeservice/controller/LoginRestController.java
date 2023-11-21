package com.suresh.employeeservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.employeeservice.model.Student;
import com.suresh.employeeservice.service.HotelService;


@RestController
@RequestMapping("/employee")
public class LoginRestController {

	@Autowired
	HotelService hotelService;
	
	
	
//	@Autowired
//	JwtUtil jwtUtil;
	
//	@Autowired
//	AuthenticationManager authenticationManager;

	private static final Logger logger=LoggerFactory
			.getLogger(LoginRestController.class);
	
	@GetMapping("/getAllData")  
	private List<Student> getAllBooks()   
	{
		logger.info("getAllData="+hotelService.getAll().toString());
		return hotelService.getAll();
		//return null; 
	}
	
	@GetMapping("/getAll")  
	private String test()   
	{
		System.out.println("call controller");
		//return studentsService.getAllBooks();
		return "success"; 
	}
	
	@GetMapping("/withoutAuth")  
	private String withOutAuth()   
	{
		System.out.println("call controller");
		//return studentsService.getAllBooks();
		return "success withOut Auth"; 
	}
	
	@PostMapping("/saveData")  
	private String saveBook(@RequestBody Student students)   
	{  
		return hotelService.saveOrUpdate(students);  
	}
	
	@GetMapping("getSingleData/{id}")
    public Student getById(@PathVariable int id) {
		System.out.println("Call employee service");
		return hotelService.getSingleData(id);
        //Optional<User> user = userService.getById(id);
    }
	
	@DeleteMapping("/deleteSingleData/{id}")
	public String deleteOrder(@PathVariable(value = "id") int id) {
	     // Access the DB and delete the order
	     return hotelService.deleteData(id);
	}
}
