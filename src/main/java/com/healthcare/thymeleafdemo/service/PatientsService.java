package com.healthcare.thymeleafdemo.service;

import com.healthcare.thymeleafdemo.entity.Patient;

import java.util.List;

public interface PatientsService {

	List<Patient> findAll();

	Patient findById(int theId);
	
	void save(Patient thePatient);
	
	void deleteById(int theId);
	
}
