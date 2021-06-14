package com.example.springmvc;

import com.example.springmvc.config.Datasource;
import com.example.springmvc.models.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) throws Exception {

		Datasource datasource = new Datasource();

		datasource.datasource();

		SpringApplication.run(SpringMvcApplication.class, args);

	}

}
