package com.healthcare.thymeleafdemo.dao;

import com.healthcare.thymeleafdemo.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorsRepository extends JpaRepository<Doctor, Integer> {}
