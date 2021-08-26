package com.healthcare.thymeleafdemo.service;

import com.healthcare.thymeleafdemo.dao.PatientsRepository;
import com.healthcare.thymeleafdemo.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientsService {

	private PatientsRepository patientsRepository;

	public PatientServiceImpl(PatientsRepository patientsRepository) {
		this.patientsRepository = patientsRepository;
	}

	@Override
	public List<Patient> findAll() {
		return patientsRepository.findAll();
	}

	@Override
	public Patient findById(int theId) {

		Optional<Patient> result = patientsRepository.findById(theId);

		Patient thePatient = null;
		
		if (result.isPresent()) {
			thePatient = result.get();
		} else {
			throw new RuntimeException("Patient with id: " + theId + " not found.");
		}
		
		return thePatient;
	}

	@Override
	public void save(Patient thePatient) {
		patientsRepository.save(thePatient);
	}

	@Override
	public void deleteById(int theId) {
		patientsRepository.deleteById(theId);
	}

}






