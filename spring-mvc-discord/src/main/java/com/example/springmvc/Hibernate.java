package com.example.springmvc;

import com.example.springmvc.models.Doctor;
import com.example.springmvc.models.Patient;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {

    public static SessionFactory getSessionFactory() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Doctor.class)
                .addAnnotatedClass(Patient.class)
                .buildSessionFactory();
        return factory;
    }

}
