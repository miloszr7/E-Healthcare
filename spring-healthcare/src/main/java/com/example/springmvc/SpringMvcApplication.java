package com.example.springmvc;

import com.example.springmvc.controller.EmbedMessageController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcApplication extends ListenerAdapter {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(SpringMvcApplication.class, args);

	}
}
