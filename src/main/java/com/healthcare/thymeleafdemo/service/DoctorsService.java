package com.healthcare.thymeleafdemo.service;

import com.healthcare.thymeleafdemo.entity.Doctor;

import java.util.List;

public interface DoctorsService {

	List<Doctor> findAll();
	
	Doctor findById(int theId);
	
	void save(Doctor theDoctor);
	
	void deleteById(int theId);
	
}
