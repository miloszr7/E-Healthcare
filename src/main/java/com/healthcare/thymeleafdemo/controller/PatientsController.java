package com.healthcare.thymeleafdemo.controller;

import com.healthcare.thymeleafdemo.entity.Doctor;
import com.healthcare.thymeleafdemo.entity.Patient;
import com.healthcare.thymeleafdemo.service.PatientsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientsController {

	private PatientsService patientsService;

	public PatientsController(PatientsService patientsService) {
		this.patientsService = patientsService;
	}

	@PostConstruct
	private void test() {

		patientsService.findAll().forEach(System.out::println);

	}

	@GetMapping("/list")
	private String showPatients(Model theModel) {

		List<Patient> thePatients = patientsService.findAll();

		theModel.addAttribute("patients", thePatients);
		
		return "list-patients";
	}

	@GetMapping("/form")
	private String addPatients(Model theModel) {

		Patient thePatient = new Patient();

		theModel.addAttribute("patient", thePatient);

		return "patients-form";
	}

	@PostMapping("/save")
	private String savePatients(@ModelAttribute("patient") Patient thePatient) {

		if (thePatient.getFirstName().isEmpty() || thePatient.getLastName().isEmpty()) {
			throw new RuntimeException("Fields cannot be empty.");
		} else {
			patientsService.save(thePatient);
		}

		return "redirect:/patients/list";
	}

	@GetMapping("/update")
	private String update(@RequestParam("id") int theId, Model theModel) {

		Patient patient = patientsService.findById(theId);

		theModel.addAttribute("patient", patient);

		return "patients-form";
	}

	@GetMapping("/remove")
	private String remove(@RequestParam("id") int theId, Model theModel) {

		patientsService.deleteById(theId);

		return "redirect:/patients/list";
	}

}









