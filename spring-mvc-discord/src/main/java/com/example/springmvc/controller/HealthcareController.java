package com.example.springmvc.controller;

import com.example.springmvc.Hibernate;
import com.example.springmvc.models.Doctor;
import com.example.springmvc.models.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

    private final SessionFactory factory = Hibernate.getSessionFactory();

    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    
    private int totalDoctors = 0;
    private int totalPatients = 0;

    @PostConstruct
    private void loadData() {

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        patients = session.createQuery("FROM Patient", Patient.class).getResultList();
        doctors = session.createQuery("FROM Doctor", Doctor.class).getResultList();

        session.getTransaction().commit();

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

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        patients = session.createQuery("FROM Patient", Patient.class).getResultList();

        session.getTransaction().commit();

        theModel.addAttribute("patients", patients);

        return "patients";
    }

    @GetMapping("/findPatient")
    public String findPatient(@ModelAttribute("patient") Patient thePatient, Model theModel) {

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Patient> patientList =
                session.createQuery("FROM Patient p WHERE p.SSN = '"+thePatient.getSSN()+"'", Patient.class)
                    .getResultList();

        session.getTransaction().commit();

        theModel.addAttribute("patientList", patientList);

        return "findPatient";
    }

    @GetMapping("/doctors")
    public String doc(Model theModel) {

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        doctors = session.createQuery("FROM Doctor", Doctor.class).getResultList();

        session.getTransaction().commit();

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

        Session session = factory.getCurrentSession();

            session.beginTransaction();

            Doctor doctor = new Doctor(
                    theDoctor.getFirstName(), theDoctor.getLastName(), theDoctor.getTitle(), theDoctor.getAge()
            );

            session.save(doctor);

            session.getTransaction().commit();

        //

        return "processDoctor";
    }

    @GetMapping("/processPatient")
    public String processPatient(@ModelAttribute("patient") Patient thePatient) {

        Session session = factory.getCurrentSession();

            session.beginTransaction();

            Patient patient = new Patient(
                    thePatient.getFirstName(), thePatient.getLastName(), thePatient.getSSN(),
                    thePatient.getPhoneNumber(), thePatient.getDesc(), thePatient.getAge()
            );

            session.save(patient);

            session.getTransaction().commit();


        //

        return "processPatient";
    }

}
