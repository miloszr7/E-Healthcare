package com.example.springmvc.controller;

import com.example.springmvc.models.Doctor;
import com.example.springmvc.models.EmbedMessage;
import com.example.springmvc.models.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/healthcare")
public class HealthcareController {

    private List<Doctor> doctors;
    private List<Patient> patients;
    private int totalDoctors = 0;
    private int totalPatients = 0;

    @PostConstruct
    private void loadData() {

        Doctor doctor1 = new Doctor("Michael", "Montana", "Surgeon", 43);
        Doctor doctor2 = new Doctor("Chloe", "Becker", "Family Doctor", 32);
        Doctor doctor3 = new Doctor("Jessica", "Smith", "Family Doctor", 35);

        doctors = new ArrayList<>();

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);

        totalDoctors = doctors.size();

        Patient patient1 = new Patient("John", "Wokulski", "453878964", "543 764 893", "none",54);

        patients = new ArrayList<>();

        patients.add(patient1);

        totalPatients = patients.size();

    }

    @GetMapping("/dashboard")
    public String dashboard(Model theModel) {

        totalDoctors = doctors.size();
        totalPatients = patients.size();

        theModel.addAttribute("totalDoctors", totalDoctors);
        theModel.addAttribute("totalPatients", totalPatients);

        return "dashboard";
    }

    @GetMapping("/patients")
    public String patient(Model theModel) {

        theModel.addAttribute("patients", patients);

        return "patients";
    }

    @GetMapping("/doctors")
    public String doc(Model theModel) {

        theModel.addAttribute("doctors", doctors);

        return "doctors";
    }

    @GetMapping("/createDoctor")
    public String addDoctors() {

        return "createDoctor";
    }

    @GetMapping("/createPatient")
    public String addPatients() {

        return "createPatient";
    }

    @GetMapping("/processDoctor")
    public String processDoctor(@ModelAttribute("doctor") Doctor theDoctor) {

        Doctor doctor = new Doctor(
                theDoctor.getFirstName(), theDoctor.getLastName(), theDoctor.getTitle(), theDoctor.getAge()
        );

        doctors.add(doctor);

        return "processDoctor";
    }

    @GetMapping("/processPatient")
    public String processPatient(@ModelAttribute("patient") Patient thePatient) {

        Patient patient = new Patient(
                thePatient.getFirstName(), thePatient.getLastName(), thePatient.getSSN(),
                thePatient.getPhoneNumber(), thePatient.getDesc(), thePatient.getAge()
        );

        patients.add(patient);

        return "processPatient";
    }

}
