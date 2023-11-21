package com.suresh.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.employeeservice.model.Student;



public interface HotelRepository extends JpaRepository<Student, Integer>{

}
