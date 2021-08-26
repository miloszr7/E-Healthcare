package com.healthcare.thymeleafdemo.dao;

import com.healthcare.thymeleafdemo.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepository extends JpaRepository<Patient, Integer> {}
