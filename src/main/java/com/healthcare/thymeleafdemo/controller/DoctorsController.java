package com.healthcare.thymeleafdemo.controller;

import com.healthcare.thymeleafdemo.entity.Doctor;
import com.healthcare.thymeleafdemo.service.DoctorsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/doctors")
public class DoctorsController {

	private DoctorsService doctorsService;

	public DoctorsController(DoctorsService doctorsService) {
		this.doctorsService = doctorsService;
	}

	@GetMapping("/list")
	private String showDoctors(Model theModel) {

		List<Doctor> theDoctors = doctorsService.findAll();

		theModel.addAttribute("doctors", theDoctors);
		
		return "list-doctors";
	}

	@GetMapping("/form")
	private String addDoctor(Model theModel) {

		Doctor theDoctor = new Doctor();

		theModel.addAttribute("doctor", theDoctor);

		return "doctors-form";
	}

	@PostMapping("/save")
	private String saveDoctor(@ModelAttribute("doctor") Doctor theDoctor) {

		if (theDoctor.getFirstName().isEmpty() || theDoctor.getLastName().isEmpty()) {
			throw new RuntimeException("First name and Last name cannot be empty.");
		} else {
			doctorsService.save(theDoctor);
		}

		return "redirect:/doctors/list";
	}

	@GetMapping("/update")
	private String update(@RequestParam("id") int theId, Model theModel) {

		Doctor doctor = doctorsService.findById(theId);

		theModel.addAttribute("doctor", doctor);

		return "doctors-form";
	}

	@GetMapping("/remove")
	private String remove(@RequestParam("id") int theId, Model theModel) {

		doctorsService.deleteById(theId);

		return "redirect:/doctors/list";
	}

}









