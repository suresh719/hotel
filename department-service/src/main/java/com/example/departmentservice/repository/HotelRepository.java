package com.example.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.departmentservice.model.Student;


public interface HotelRepository extends JpaRepository<Student, Integer>{

}
