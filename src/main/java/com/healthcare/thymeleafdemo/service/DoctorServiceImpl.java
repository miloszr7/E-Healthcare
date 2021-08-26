package com.healthcare.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import com.healthcare.thymeleafdemo.entity.Doctor;
import org.springframework.stereotype.Service;

import com.healthcare.thymeleafdemo.dao.DoctorsRepository;

@Service
public class DoctorServiceImpl implements DoctorsService {

	private DoctorsRepository doctorsRepository;

	public DoctorServiceImpl(DoctorsRepository doctorsRepository) {
		this.doctorsRepository = doctorsRepository;
	}

	@Override
	public List<Doctor> findAll() {
		return doctorsRepository.findAll();
	}

	@Override
	public Doctor findById(int theId) {

		Optional<Doctor> result = doctorsRepository.findById(theId);

		Doctor theDoctor = null;
		
		if (result.isPresent()) {
			theDoctor = result.get();
		} else {
			throw new RuntimeException("Doctor with id: " + theId + " not found.");
		}
		
		return theDoctor;
	}

	@Override
	public void save(Doctor theDoctor) {
		doctorsRepository.save(theDoctor);
	}

	@Override
	public void deleteById(int theId) {
		doctorsRepository.deleteById(theId);
	}

}






